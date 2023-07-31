package com.zybooks.mpfinalproject;

import androidx.room.*;
import java.util.List;

@Dao
public interface LocationDao {
    @Query("SELECT * FROM Location")
    List<Location> getAllLocations();

    @Query("DELETE FROM Location")
    void deleteAllLocations();

    @Query("SELECT * FROM Location WHERE location = :location")
    List<Location> getLocation(String location);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertLocation(Location location);

    @Update
    void updateLocation(Location location);

    @Delete
    void delete(Location location);
}
