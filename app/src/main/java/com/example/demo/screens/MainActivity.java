package com.example.demo.screens;

import android.os.Bundle;

import com.example.demo.common.DI.BaseActivity;

public class MainActivity extends BaseActivity implements MainMvc.Listener {

    private MainMvcImp mvcImp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mvcImp = getCompositionRoot().getViewMvcFactory().getMainViewMvc(null);
        mvcImp.registerListener(this);


        setContentView(mvcImp.getRootView());
    }


    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();
        mvcImp.unregisterListener(this);
    }
}