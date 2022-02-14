package com.example.starterapp.common.DI;

import androidx.fragment.app.Fragment;
import com.example.starterapp.CustomApplication;

public class BaseFragment extends Fragment {

    private ControllerCompositionRoot mControllerCompositionRoot;
    protected ControllerCompositionRoot getCompositionRoot(){
        if(mControllerCompositionRoot == null){
            mControllerCompositionRoot = new ControllerCompositionRoot(
                    ((CustomApplication) getActivity().getApplication()).getCompositionRoot(),
                    getActivity()
            );
        }
        return mControllerCompositionRoot;
    }
}
