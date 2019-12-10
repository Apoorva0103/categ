package com.example.android.categ;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> main_list;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_list= new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        main_list.add(new Model(R.drawable.veggie_cabbage, "Cabbage"));
        main_list.add(new Model(R.drawable.veggie_broccoli, "Broccoli"));
        main_list.add(new Model(R.drawable.veggie_carrot, "Carrot"));
        main_list.add(new Model(R.drawable.veggie_cauliflower, "Cauliflower"));
        main_list.add(new Model(R.drawable.veggie_cucumber, "Cucumber"));
        main_list.add(new Model(R.drawable.veggie_eggplant, "Egg Plant"));
        main_list.add(new Model(R.drawable.veggie_garlic, "Garlic"));
        main_list.add(new Model(R.drawable.veggie_ginger, "Ginger"));
        main_list.add(new Model(R.drawable.veggie_green_beans, "Green Beans"));
        main_list.add(new Model(R.drawable.veggie_lady_finger, "Lady Finger"));
        main_list.add(new Model(R.drawable.veggie_mint, "Mint"));
        main_list.add(new Model(R.drawable.veggie_onion, "Onion"));
        main_list.add(new Model(R.drawable.veggie_pea, "Peas"));
        main_list.add(new Model(R.drawable.veggie_potato, "Potato"));
        main_list.add(new Model(R.drawable.veggie_radish, "Radish"));
        main_list.add(new Model(R.drawable.veggie_spinach, "Spinach"));
        main_list.add(new Model(R.drawable.veggie_tomato, "Tomato"));


        adapter = new CustomAdapter(main_list,getApplicationContext());

        recyclerView.setAdapter(adapter);
    }
}









