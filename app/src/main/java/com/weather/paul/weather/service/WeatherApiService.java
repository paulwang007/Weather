package com.weather.paul.weather.service;

import android.os.AsyncTask;

import com.google.gson.internal.LinkedHashTreeMap;
import com.weather.paul.weather.model.Weather;
import com.weather.paul.weather.network.RetrofitService;

import java.util.List;

import retrofit.RestAdapter;

/**
 * Created by Paul Wang on 7/5/2015.
 */
public class WeatherApiService extends AsyncTask{

    public static final String DOMAIN = "http://api.openweathermap.org";


    @Override
    protected Object doInBackground(Object[] params) {

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(DOMAIN)
                .build();

        RetrofitService service = restAdapter.create(RetrofitService.class);

//        service.getData();


        return null;
    }

}
