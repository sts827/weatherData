package com.aio.weather.service;


import com.aio.weather.domain.GeoInfo;

import java.util.HashMap;

public interface WeatherService {

    // weather info 가져오기
    HashMap<String,Object> getWeatherInfo(GeoInfo geoInfo);
    // weather info 추가하기
    void addWeatherInfo();
    // weather info 수정하기
    void updateWeatherInfo();


}
