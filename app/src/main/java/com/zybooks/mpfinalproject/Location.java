package com.zybooks.mpfinalproject;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

// Is entity class, class name is used to name table

@Entity
public class Location {
    public Location(){

    }

    public Location(@NonNull String location) {
        this.location = location;
    }
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "location")
    public String location;
}
