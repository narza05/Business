package com.example.business;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HrFrag1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater,@Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        return inflater.inflate(R.layout.hr_frag1_layout,container, false);
    }
}
