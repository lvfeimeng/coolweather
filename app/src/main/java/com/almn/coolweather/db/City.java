package com.almn.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by AlMn on 2017/3/15 015.
 */

public class City extends DataSupport {
    private int id;
    private String CityName;
    private int CityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public int getCityCode() {
        return CityCode;
    }

    public void setCityCode(int CityCode) {
        this.CityCode = CityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
