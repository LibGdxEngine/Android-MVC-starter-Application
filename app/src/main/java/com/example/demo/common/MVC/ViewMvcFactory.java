package com.example.demo.common.MVC;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.example.demo.screens.MainMvcImp;

public class ViewMvcFactory {
    private final LayoutInflater layoutInflater;

    public ViewMvcFactory(LayoutInflater layoutInflater) {
        this.layoutInflater = layoutInflater;
    }

    public MainMvcImp getMainViewMvc(@Nullable ViewGroup parent){
        return new MainMvcImp(layoutInflater, parent);
    }
}
