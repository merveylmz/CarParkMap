package com.example.parkingdemo.ui.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.parkingdemo.R;

import static com.example.parkingdemo.ui.activity.MainActivity.forceCrash;

/**
 * Created by ss on 1.8.2017.
 */

public class FragmentMap extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_map, container, false);

        return view;
    }
}
