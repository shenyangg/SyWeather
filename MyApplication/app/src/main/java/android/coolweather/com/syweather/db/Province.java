package android.coolweather.com.syweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by CM-NB1 on 2018/5/7.
 * 省
 */

public class Province extends DataSupport{
    private int id;// id 是每个实体类中都应该有的字段
    private String provinceName;//记录省的名字
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
