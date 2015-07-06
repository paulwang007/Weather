package com.weather.paul.weather.model;

import com.google.gson.internal.LinkedTreeMap;

import java.util.List;

/**
 * Created by Paul Wang on 7/5/2015.
 */
public class Weather {

    private final List<LinkedTreeMap> mData;

    public Weather(List<LinkedTreeMap> data) {
        mData = data;
    }



}
