package com.aio.weather.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MidTermSkyGeoInfo extends GeoInfo {
    // 중기 예보 육상정보

    private String rnSt3Am; // 3일후 오전 강수 확률
    private String rnSt3Pm; // 3일후 오전 강수 확률
    private String rnSt4Am; // 4일후 오전 강수 확률
    private String rnSt4Pm; // 4일후 오전 강수 확률
    private String rnSt5Am; // 5일후 오전 강수 확률
    private String rnSt5Pm; // 5일후 오전 강수 확률
    private String rnSt6Am; // 6일후 오전 강수 확률
    private String rnSt6Pm; // 6일후 오전 강수 확률
    private String rnSt7Am; // 7일후 오전 강수 확률
    private String rnSt7Pm; // 7일후 오전 강수 확률
    private String rnSt8; // 8일후 강수 확률
    private String rnSt9; // 9일후 강수 확률
    private String rnSt10; // 10일후 강수 확률
    private String wf3Am; // 3일후 오전날씨 예보
    private String wf3Pm; // 3일후 오후날씨 예보
    private String wf4Am; // 4일후 오전날씨 예보
    private String wf4Pm; // 4일후 오후날씨 예보
    private String wf5Am; // 5일후 오전날씨 예보
    private String wf5Pm; // 5일후 오후날씨 예보
    private String wf6Am; // 6일후 오전날씨 예보
    private String wf6Pm; // 6일후 오후날씨 예보
    private String wf7Am; // 7일후 오전날씨 예보
    private String wf7Pm; // 7일후 오후날씨 예보
    private String wf8; // 8일후 날씨 예보
    private String wf9; // 9일후 날씨 예보
    private String wf10; // 10일후 날씨 예보





}
