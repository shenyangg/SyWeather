package android.coolweather.com.syweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by CM-NB1 on 2018/5/22.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
