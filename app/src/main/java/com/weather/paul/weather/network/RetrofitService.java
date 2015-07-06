package com.weather.paul.weather.network;

import com.google.gson.internal.LinkedHashTreeMap;
import com.weather.paul.weather.model.Weather;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Paul Wang on 7/5/2015.
 */
public interface RetrofitService {

    @GET("/data/{user}2.5/forecast?q=Los%20Angeles,us&mode=json&units=imperial")
    public List<Weather> getData();

}
