package com.almn.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by AlMn on 2017/3/15 015.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
