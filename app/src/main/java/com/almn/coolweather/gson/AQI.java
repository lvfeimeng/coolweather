package com.almn.coolweather.gson;

/**
 * Created by AlMn on 2017/3/15 015.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
