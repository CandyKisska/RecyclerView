package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView view = findViewById(R.id.list);

        PartyAdapter adapter = new PartyAdapter(getData());

        view.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);



        view.setLayoutManager(manager);


    }
    public ArrayList<Party> getData() {
        ArrayList<Party> data = new ArrayList<>();
        data.add(new Party("29 февр.","236 м.", "Праздник","Москва","17.45",getDrawable(R.drawable.party1)));

        return data;
    }
}
