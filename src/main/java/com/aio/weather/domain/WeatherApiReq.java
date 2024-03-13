package com.aio.weather.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherApiReq {
    private int id;
    private String baseDate; // * 예보일
    private String baseTime; // * 발표 시간 [중기]
    private String tmFc; // * 발표시각 [중기]
    private String dataType; // * 데이터 타입
    private float nx; // * 기상청 격자 x좌표 (단기예보 지점)
    private float ny; // * 기상청 격자 y좌표 (단기예보 지점)
    private String regId; // * 예부구역 코드(ex -> 11B00000: 서울,인천,경기도)
    private String locationName; // 위치명
    private String stnId; // * 지점번호 (108:전국, 109:서울, 인천, 경기도, 131: 충청북도,...)

    private String resultCode; // 결과 코드
    private String resultMessage; // 결과 메시지
    private int pagePerRange; // 한 페이지 결과수
    private int pageNum; // 페이지 번호
    private int total; // 총 개수
}
