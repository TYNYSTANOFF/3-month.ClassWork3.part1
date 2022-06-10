package com.example.a3_monthclasswork3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCars;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCars = itemView.findViewById(R.id.tv_name);
    }

    public void bind(String name){
        tvCars.setText(name);
    }
}
