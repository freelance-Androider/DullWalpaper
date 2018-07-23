package com.jeffysmak.Wallpapers.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Category  implements Parcelable {
    private String Title, ImageUrl;

    public Category() {
    }

    public Category(String title, String imageUrl) {
        Title = title;
        ImageUrl = imageUrl;
    }

    protected Category(Parcel in) {
        Title = in.readString();
        ImageUrl = in.readString();
    }

    public static final Creator<Category> CREATOR = new Creator<Category>() {
        @Override
        public Category createFromParcel(Parcel in) {
            return new Category(in);
        }

        @Override
        public Category[] newArray(int size) {
            return new Category[size];
        }
    };

    public String getTitle() {
        return Title;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Title);
        dest.writeString(ImageUrl);
    }
}
