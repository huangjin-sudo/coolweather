package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

    //
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    //城市名字
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }

    //城市代码
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }

    //记当前市所属省的Id
    public int getProvinceId(){
        return provinceId;
    }
    public  void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}
