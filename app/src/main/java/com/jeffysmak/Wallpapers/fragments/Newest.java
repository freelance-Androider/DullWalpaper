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
public class Newest extends Fragment {

    private static Newest Instance = null;

    public static Newest getInstance() {
        if (Instance == null) {
            Instance = new Newest();
        }
        return Instance;
    }

    public Newest() {

        Log.i("Constructor","called : Newest");
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_newest, container, false);
    }

}
