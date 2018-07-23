package com.jeffysmak.Wallpapers.adapters;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.jeffysmak.Wallpapers.fragments.All;
import com.jeffysmak.Wallpapers.fragments.Newest;
import com.jeffysmak.Wallpapers.fragments.Popular;
import com.jeffysmak.Wallpapers.fragments.categories;
import com.jeffysmak.Wallpapers.models.Category;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter {



    public PagerAdapter(FragmentManager fm, List<Category> list) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return categories.getInstance();
        } else if (position == 1) {
            return All.getInstance();
        } else if (position == 2) {
            return Newest.getInstance();
        } else if (position == 3) {
            return Popular.getInstance();
        } else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Categories";
            case 1:
                return "All";
            case 2:
                return "Newest";
            case 3:
                return "Popular";
        }
        return "";
    }
}
