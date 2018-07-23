package com.jeffysmak.Wallpapers.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.jeffysmak.Wallpapers.R;
import com.jeffysmak.Wallpapers.adapters.CategoryAdapter;
import com.jeffysmak.Wallpapers.helper.FirebaseHelper;
import com.jeffysmak.Wallpapers.interfaces.categoryListener;
import com.jeffysmak.Wallpapers.models.Category;

import java.util.ArrayList;
import java.util.List;

public class categories extends Fragment {

    private static categories Obj = null;


    private RecyclerView listView;

    private List<Category> categoryList;

    private CategoryAdapter categoryAdapter;


    public categories() {
        categoryList = new ArrayList<>();
    }

    public static categories getInstance() {
        if (Obj == null) {
            Obj = new categories();
        }
        return Obj;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        listView = v.findViewById(R.id.mRecycler);
        listView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        listView.setHasFixedSize(true);
        SnapHelper helper = new LinearSnapHelper();
        helper.attachToRecyclerView(listView);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        categoryList = new FirebaseHelper(getActivity()).getCategoriesList();
        categoryAdapter = new CategoryAdapter(getActivity(), categoryList);
        listView.setAdapter(categoryAdapter);
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

//        categoryAdapter.notifyDataSetChanged();

        super.onViewCreated(view, savedInstanceState);
    }
}