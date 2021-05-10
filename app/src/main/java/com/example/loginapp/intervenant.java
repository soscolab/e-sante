package com.example.loginapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class intervenant extends AppCompatActivity implements IntervenantRecyclerView.ItemClickListener {

    private ArrayList<String> planetes;
    IntervenantRecyclerView adapter;
    TextView tv_auxiliaire;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intervenant);

        // data to populate the RecyclerView with
        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("Patient  1");
        animalNames.add("Patient  2");
        animalNames.add("Patient  3");
        animalNames.add("Patient 4");
        animalNames.add("Patient  5");
        animalNames.add("Patient  6");
        animalNames.add("Patient  7");
        animalNames.add("Patient  8");
        animalNames.add("Patient  9");
        animalNames.add("Patient  10");
        animalNames.add("Patient  11");
        animalNames.add("Patient  12");
        animalNames.add("Patient  13");
        animalNames.add("Patient  14");
        animalNames.add("Patient  15");
        animalNames.add("Patient  16");
        animalNames.add("Patient  17");
        animalNames.add("Patient  18");
        animalNames.add("Patient  19");
        animalNames.add("Patient  20");
        animalNames.add("Patient  21");
        animalNames.add("Patient  22");
        animalNames.add("Patient  23");
         String[] taillePlanetes = {"4900", "12000", "12800", "6800", "144000", "120000", "52000", "50000", "2300"};
        final Spinner spinner = findViewById(R.id.simpleSpinner);




        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvAnimals);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new IntervenantRecyclerView(this, animalNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        //Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }


}
