package com.jeffysmak.Wallpapers.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jeffysmak.Wallpapers.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Popular extends Fragment {

    private static Popular Instance = null;

    public static Popular getInstance() {
        if (Instance == null) {
            Instance = new Popular();
        }
        return Instance;
    }


    public Popular() {
        Log.i("Constructor","called : Popular");
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popular, container, false);
    }

}
