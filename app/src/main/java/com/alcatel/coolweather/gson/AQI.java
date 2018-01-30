package com.alcatel.coolweather.gson;

/**
 * Created by wangtao on 2018/1/30.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
