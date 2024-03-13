package com.aio.weather.service;

import com.aio.weather.dao.WeatherServiceDao;
import com.aio.weather.domain.GeoInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class WeatherServiceImpl implements WeatherService {

    private WeatherServiceDao weatherServiceDao;

    @Autowired
    public WeatherServiceImpl(WeatherServiceDao weatherServiceDao){
        this.weatherServiceDao = weatherServiceDao;
    }

    @Override
    public HashMap<String, Object> getWeatherInfo(GeoInfo geoInfo) {
        return null;
    }

    @Override
    public void addWeatherInfo() {
        // 주기적으로 실행
        // 1.
    }

    @Override
    public void updateWeatherInfo() {
        // 주기적으로 실행
    }

}
