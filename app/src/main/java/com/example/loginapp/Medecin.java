package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

import java.util.ArrayList;


public class Medecin extends AppCompatActivity implements MedecinRecyclerView.ItemClickListener {


    MedecinRecyclerView adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medecin);

        // data to populate the RecyclerView with
        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("Parcours 1");
        animalNames.add("Parcours 2");
        animalNames.add("Parcours 3");
        animalNames.add("Parcours 4");
        animalNames.add("Parcours 5");
        animalNames.add("Parcours 6");
        animalNames.add("Parcours 7");
        animalNames.add("Parcours 8");
        animalNames.add("Parcours 9");
        animalNames.add("Parcours 10");
        animalNames.add("Parcours 11");
        animalNames.add("Parcours 12");
        animalNames.add("Parcours 13");
        animalNames.add("Parcours 14");
        animalNames.add("Parcours 15");
        animalNames.add("Parcours 16");
        animalNames.add("Parcours 17");
        animalNames.add("Parcours 18");
        animalNames.add("Parcours 19");
        animalNames.add("Parcours 20");
        animalNames.add("Parcours 21");
        animalNames.add("Parcours 22");
        animalNames.add("Parcours 23");


        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvAnimals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MedecinRecyclerView(this, animalNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
       // Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }


}
