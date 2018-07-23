package com.jeffysmak.Wallpapers.helper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.jeffysmak.Wallpapers.common;
import com.jeffysmak.Wallpapers.models.Category;

import java.util.ArrayList;
import java.util.List;

public class FirebaseHelper {

    private Context context;
    List<Category> categories;
    private DatabaseReference databaseReference;

    public FirebaseHelper(Context context) {
        this.context = context;
        databaseReference = FirebaseDatabase.getInstance().getReference(common.KEY_CATEGORY);
    }

    public List<Category> getCategoriesList() {
        categories = new ArrayList<>();
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot item : dataSnapshot.getChildren()) {
                    Category category = item.getValue(Category.class);
                    Log.i("FirebaseHelper", category.getTitle());
                    categories.add(category);
                    Log.i("INFO",categories.get(0).getTitle());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        return categories;
    }
}
