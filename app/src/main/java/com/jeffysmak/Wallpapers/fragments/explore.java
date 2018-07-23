package com.jeffysmak.Wallpapers.fragments;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jeffysmak.Wallpapers.R;
import com.jeffysmak.Wallpapers.adapters.PagerAdapter;
import com.jeffysmak.Wallpapers.helper.FirebaseHelper;
import com.jeffysmak.Wallpapers.models.Category;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class explore extends Fragment {

    public static explore Instance = null;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Activity activity;
    private Context context;
    private PagerAdapter pagerAdapter;

    public static explore getInstance() {
        if (Instance == null) {
            Instance = new explore();
        }
        return Instance;
    }

    public explore() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        activity = (Activity) getActivity();
        context = getActivity();
        return inflater.inflate(R.layout.fragment_explore, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View v, @Nullable Bundle savedInstanceState) {
        tabLayout = v.findViewById(R.id.tabs_Explore);
        viewPager = v.findViewById(R.id.viewpager_Explore);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        List<Category> categories = new FirebaseHelper(getActivity()).getCategoriesList();
        pagerAdapter = new PagerAdapter(getChildFragmentManager(), categories);
        viewPager.setAdapter(pagerAdapter);
        super.onActivityCreated(savedInstanceState);
    }
}
