package com.example.workoutapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView workoutRecycleViewer = findViewById(R.id.rv);

        ArrayList<WorkoutModel> workoutModels = new ArrayList<WorkoutModel>();

        workoutModels.add(new WorkoutModel("Chest", "Push-ups, Dips, BenchPress"));
        workoutModels.add(new WorkoutModel("Back", "Pull-ups, Pull-downs"));
        workoutModels.add(new WorkoutModel("Legs", "Squats, Dead-lifts"));

        // initializing the adapter class and passing the arraylist to it.
        WorkoutAdapter workoutAdapter = new WorkoutAdapter(this, workoutModels);

        // below line is for setting a layout manager for the recycler view.
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // below two lines are for setting layout manager and adapter to the recycler view.
        workoutRecycleViewer.setLayoutManager(linearLayoutManager);
        workoutRecycleViewer.setAdapter(workoutAdapter);

    }
}