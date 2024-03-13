package com.aio.weather.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class WeatherApiUtil {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Value("weather.openapi.key")
    private String apiKey;

    private String url;
    private String format;

    public void setApiBaseUrl(String url, String format){
        this.url=url;
        this.format=format;
    }



}
