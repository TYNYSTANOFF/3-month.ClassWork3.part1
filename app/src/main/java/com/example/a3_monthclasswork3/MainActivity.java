package com.example.a3_monthclasswork3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView carRV;
    private ArrayList<String> name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carRV = findViewById(R.id.recycler_car);
        name = new ArrayList<String>();
        CarAdapter adapter = new CarAdapter(name);
        carRV.setAdapter(adapter);
        name.add("Mers");
        name.add("Bmw");
        name.add("Audi");
        name.add("Nissan");
        name.add("Mitsubishi");
        name.add("Mazda");
        name.add("Lada");
        name.add("Jiguli");
        name.add("Honda");
        name.add("Bugati");
        name.add("Lamborgini");
        name.add("Tesla");
        name.add("AstonMartin");
        name.add("Car");
        name.add("LadaVesta");


    }

}