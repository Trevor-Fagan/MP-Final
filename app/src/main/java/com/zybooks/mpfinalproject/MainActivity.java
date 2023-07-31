package com.zybooks.mpfinalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LocationDatabase db = Room.databaseBuilder(getApplicationContext(), LocationDatabase.class, "location-db").allowMainThreadQueries().fallbackToDestructiveMigration().build();
        LocationDao locationDao = db.locationDao();

        Location texas = new Location("Texas");
        //locationDao.insertLocation(texas);

        List<Location> locations = locationDao.getAll();
        Toast.makeText(getApplicationContext(), locations.get(0).toString(), Toast.LENGTH_SHORT).show();
    }
}