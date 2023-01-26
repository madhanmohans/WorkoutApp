package com.example.workoutapp;

import android.widget.ListAdapter;

import java.util.ArrayList;

public class WorkoutModel {
    private String muscleGroup;
    private String exercises;

    public WorkoutModel(String muscleGroup, String exercises) {
        this.muscleGroup = muscleGroup;
        this.exercises = exercises;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(String muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public String getExercises() {
        return exercises;
    }

    public void setExercises(String exercises) {
        this.exercises = exercises;
    }
}
