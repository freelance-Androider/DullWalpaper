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
public class profile extends Fragment {

    private static profile Instance = null;

    public static profile getInstance() {
        if (Instance == null) {
            Instance = new profile();
        }
        return Instance;
    }

    public profile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

}
