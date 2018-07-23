package com.jeffysmak.Wallpapers.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jeffysmak.Wallpapers.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class upload extends Fragment {


    private static upload Instance = null;

    public static upload getInstance() {
        if (Instance == null) {
            Instance = new upload();
        }
        return Instance;
    }

    public upload() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_upload, container, false);
    }

}
