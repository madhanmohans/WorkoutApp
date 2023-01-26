package com.example.workoutapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class WorkoutAdapter extends RecyclerView.Adapter<WorkoutAdapter.ViewHolder> {

    private final ArrayList<WorkoutModel> workoutModels;

    public WorkoutAdapter(Context context, ArrayList<WorkoutModel> workoutModels) {
        this.workoutModels = workoutModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        WorkoutModel model = workoutModels.get(position);
        holder.muscleGroup.setText(model.getMuscleGroup());
        holder.exercises.setText(model.getExercises());
    }

    @Override
    public int getItemCount() {
        return workoutModels.size();
    }

    // View holder class for initializing views
    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView muscleGroup;
        private final TextView exercises;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            muscleGroup = itemView.findViewById(R.id.idMuscleGroup);
            exercises =  itemView.findViewById(R.id.idExercises);
        }
    }
}
