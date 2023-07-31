package com.zybooks.mpfinalproject;

import androidx.room.*;
import java.util.List;

@Dao
public interface LocationDao {
    @Query("SELECT * FROM Location")
    List<Location> getAll();

    @Query("DELETE FROM Location")
    void deleteAllLocations();

    @Insert()
    void insertLocation(Location location);

    @Delete
    void delete(Location location);
}
