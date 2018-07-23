package com.jeffysmak.Wallpapers.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jeffysmak.Wallpapers.R;
import com.jeffysmak.Wallpapers.interfaces.ItemClickListener;

public class CategoriesAdapter extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView titles;
    public ImageView thumbs;
    public ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public CategoriesAdapter(View itemView) {
        super(itemView);
        titles = itemView.findViewById(R.id.category_Title);
        thumbs = itemView.findViewById(R.id.category_Thumbnail);
        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition(), false);
    }
}
