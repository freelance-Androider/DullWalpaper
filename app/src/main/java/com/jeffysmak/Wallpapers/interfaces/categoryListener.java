package com.jeffysmak.Wallpapers.interfaces;

import com.jeffysmak.Wallpapers.models.Category;

import java.util.List;

public interface categoryListener {
    void onReceiveCategoriesList(List<Category> list);
}
