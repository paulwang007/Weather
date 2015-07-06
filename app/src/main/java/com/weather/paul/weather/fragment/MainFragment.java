package com.weather.paul.weather.fragment;

import android.support.v4.app.ListFragment;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.weather.paul.weather.R;
import com.weather.paul.weather.model.Weather;

import java.util.WeakHashMap;

/**
 * Created by Paul Wang on 7/5/2015.
 */
public class MainFragment extends ListFragment {


    public String[] weatherArray = {"1", "2", "3"};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle("Weather");

        ArrayAdapter<String> weather = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, weatherArray);

        setListAdapter(weather);
    }


}
