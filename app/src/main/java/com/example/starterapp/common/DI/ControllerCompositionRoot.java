package com.example.starterapp.common.DI;

import android.app.Activity;
import android.view.LayoutInflater;

import com.example.starterapp.common.MVC.ViewMvcFactory;

public class ControllerCompositionRoot {
    private final CompositionRoot mCompositionRoot;
    private Activity activity;

    public ControllerCompositionRoot(CompositionRoot mCompositionRoot, Activity activity) {
        this.mCompositionRoot = mCompositionRoot;
        this.activity = activity;
    }

    public Object getDjangoApi(){
        return mCompositionRoot.getDjangoApi();
    }

    public ViewMvcFactory getViewMvcFactory(){
        return new ViewMvcFactory(getLayoutInflater());
    }

    private LayoutInflater getLayoutInflater(){
        return LayoutInflater.from(activity);
    }
}
