package android.coolweather.com.syweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by CM-NB1 on 2018/5/7.
 *
 * 市
 * id 是每个实体类中都应该有的字段
 * cityName 记录市的名字， cityCode 记录市的代号， provinceId 记录当前市所属省的 id值
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
