package com.example.zhousheng.weather_forecast.Gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
    @SerializedName("comf")     //serializedName用于解析json中的数据名称
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;


    public class Comfort
    {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash
    {
    @SerializedName("txt")
    public String info;
    }

    public class Sport
    {
        @SerializedName("txt")
        public String info;
    }


}
