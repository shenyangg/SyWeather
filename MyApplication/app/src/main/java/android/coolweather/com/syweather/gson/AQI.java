package android.coolweather.com.syweather.gson;

/**
 * Created by CM-NB1 on 2018/5/22.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
