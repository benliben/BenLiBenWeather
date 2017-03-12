package com.example.administrator.benlibenweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/12:52.
 * Developer by LiYuanzXiong.
 * 市
 */

public class City extends DataSupport {
    private int id;
    private String cityName;//市的名称
    private int cityCode;//市代号
    private int provinceId;//记录当前市所属省的id知值


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
