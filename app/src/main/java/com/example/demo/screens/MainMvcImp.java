package com.example.demo.screens;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.demo.R;
import com.example.demo.common.MVC.BaseObservableMvcView;

public class MainMvcImp extends BaseObservableMvcView<MainMvc.Listener> implements MainMvc {

    public MainMvcImp(LayoutInflater inflater, ViewGroup parent) {
        setRootView(inflater.inflate(R.layout.activity_main, parent, false));

    }

}