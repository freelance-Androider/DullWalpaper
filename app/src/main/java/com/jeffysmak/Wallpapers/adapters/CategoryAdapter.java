package com.jeffysmak.Wallpapers.adapters;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.jeffysmak.Wallpapers.R;
import com.jeffysmak.Wallpapers.interfaces.ItemClickListener;
import com.jeffysmak.Wallpapers.models.Category;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private Context context;
    //    private List
    private List<Category> categoryList;


    public CategoryAdapter(Context context, List<Category> list) {
        this.context = context;
        this.categoryList = list;
    }

//    private String[] categories = {"3D", "Abstract", "Air Planes", "Animals", "Anime", "Black", "Cars", "Celebrities", "City", "Dark", "Fantasy", "Flowers", "Food", "Girls", "Hi-Tech", "Holidays", "Macro", "Men", "Music", "Nature", "Other", "Space", "Sports", "Textures", "Vector"};

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.category_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.titles.setText(categoryList.get(position).getTitle());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View v, int position, boolean isLongClicked) {
                if (isLongClicked) {
                    Toast.makeText(context, "Long Clicked At " + categoryList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context, "Clicked At " + categoryList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        Glide.with(context).load(categoryList.get(position).getImageUrl()).into(holder.thumbs);
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener, View.OnClickListener {
        private TextView titles;
        private ImageView thumbs;
        private ItemClickListener itemClickListener;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
            titles = itemView.findViewById(R.id.category_Title);
            thumbs = itemView.findViewById(R.id.category_Thumbnail);
        }

        @Override
        public void onClick(View v) {
            itemClickListener.onClick(v, getAdapterPosition(), false);
        }

        public void setItemClickListener(ItemClickListener listener) {
            this.itemClickListener = listener;
        }

        @Override
        public boolean onLongClick(View v) {
            itemClickListener.onClick(v, getAdapterPosition(), true);
            return true;
        }
    }
}
