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
public class All extends Fragment {

    private static All Instance = null;

    public static All getInstance() {
        if (Instance == null) {
            Instance = new All();
        }
        return Instance;
    }


    public All() {
        Log.i("Constructor","called : All");
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all2, container, false);
    }

}
