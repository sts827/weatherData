package com.aio.weather.controller;

import com.aio.weather.service.WeatherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ManageApiController {

    private WeatherServiceImpl weatherInfoImpl;

    @Autowired
    public ManageApiController(WeatherServiceImpl weatherInfoImpl){
        this.weatherInfoImpl = weatherInfoImpl;
    }
}
