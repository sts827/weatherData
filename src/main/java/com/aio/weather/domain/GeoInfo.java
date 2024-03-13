package com.aio.weather.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GeoInfo {
    // geo info entity
    private int id;
    private double latitude; // 예보구역 latitude
    private double longitude; // 예보구역 longitude
    private String address; // 예보구역 주소
    private String regId; // 예보구역 코드
    private double xLat; // 기상청 x축 격자정보
    private double yLng;// 기상청 y축 격자정보

    // transfer latitude to grid x,y
    public void GeoTransfer(GeoInfo geoInfo,int mode){
        double RE = 6371.00877; // 지구반경(km)
        double GRID = 5.0; // 격자간격(km)
        double SLAT1 = 30.0; // 투영 위도1(degree)
        double SLAT2 = 60.0; // 투영 위도2(degree)
        double OLAT = 38.0; // 기준점 위도(degree)
        double OLON = 126.0; // 기준점 경도(degree)
        double XO = 43; //기준점 X좌표(grid)
        double YO = 136; // 기준점 Y좌표(grid)

        double DEGRAD = Math.PI / 180.0;
        double RADDEG = 180.0 / Math.PI;

        double re = RE / GRID;
        double slat1 = SLAT1 * DEGRAD;
        double slat2 = SLAT2 * DEGRAD;
        double olon = OLON * DEGRAD;
        double olat = OLAT * DEGRAD;

        double sn = Math.tan(Math.PI * 0.25 + slat2 * 0.5) / Math.tan(Math.PI * 0.25 + slat1 * 0.5);
        sn = Math.log(Math.cos(slat1) / Math.cos(slat2) ) / Math.log(sn);
        double sf = Math.tan(Math.PI * 0.25 + slat1 * 0.5);
        sf = Math.pow(sf,sn)*Math.cos(slat1) / sn;
        double ro = Math.tan(Math.PI * 0.25 + olat * 0.5);
        ro = re * sf / Math.pow(ro,sn);

        // ->
        if (mode ==0){
            double ra = Math.tan(Math.PI * 0.25 + (geoInfo.getLatitude()) * DEGRAD * 0.5);
            ra = re * sf / Math.pow(ra,sn);
            double theta = geoInfo.getLongitude() * DEGRAD - olon;
            if(theta > Math.PI) theta -= 2.0 * Math.PI;
            if(theta < -Math.PI) theta +=2.0*Math.PI;
            theta *=sn;
            double x = Math.floor(ra * Math.sin(theta) + XO + 0.5);
            double y = Math.floor(ro - ra*Math.cos(theta) + YO + 0.5);
            geoInfo.setXLat(x);
            geoInfo.setYLng(y);
        }
        else{
            double xlat = geoInfo.getXLat();
            double ylon = geoInfo.getYLng();
            double xn = xlat - XO;
            double yn = ro - ylon + YO;
            double ra = Math.sqrt(xn * xn + yn * yn);

            if (sn < 0.0){
                ra = -ra;
            }
            double alat = Math.pow((re*sf/ra),(1.0/sn));
            alat = 2.0 * Math.atan(alat) - Math.PI*0.5;

            double theta = 0.0;
            if (Math.abs(xn) <= 0.0){
                theta = 0.0;
            }else{
                if(Math.abs(yn) <= 0.0){
                    theta = Math.PI * 0.5;
                    if(xn < 0.0){
                        theta = - theta;
                    }
                }
                else theta = Math.atan2(xn,yn);
            }
            double alon = theta / sn + olon;
            geoInfo.setLatitude(alat * RADDEG);
            geoInfo.setLongitude(alon * RADDEG);

        }

    }


}
