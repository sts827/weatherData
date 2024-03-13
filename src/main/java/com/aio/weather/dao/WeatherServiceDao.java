package com.aio.weather.dao;

import com.aio.weather.service.WeatherService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
public interface WeatherServiceDao {

    ArrayList<WeatherService> selectWeatherInfo();

    void updateWeatherInfo(WeatherService weatherService);

    void insertWeatherInfo(WeatherService weatherService);

}
