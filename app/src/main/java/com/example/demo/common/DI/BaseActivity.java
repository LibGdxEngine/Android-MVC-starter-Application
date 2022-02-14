package com.example.demo.common.DI;

import androidx.appcompat.app.AppCompatActivity;
import com.example.demo.CustomApplication;

public class BaseActivity extends AppCompatActivity {

    private ControllerCompositionRoot mControllerCompositionRoot;
    protected ControllerCompositionRoot getCompositionRoot(){
        if(mControllerCompositionRoot == null){
            mControllerCompositionRoot = new ControllerCompositionRoot(
                    ((CustomApplication) getApplication()).getCompositionRoot(),
                    this
            );
        }
        return mControllerCompositionRoot;
    }
}
