package android.coolweather.com.syweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by CM-NB1 on 2018/5/22.
 */

public class Basic {
    @SerializedName("city")
    public String CityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
