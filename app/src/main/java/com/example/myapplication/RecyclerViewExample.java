package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewExample extends AppCompatActivity {
    RecyclerView rv;
    int[] image = {R.drawable.canvas,R.drawable.canvas1};
    String[] name = {"Plane 1","Plane 2"};
    String[] time = {"9:00","12:00"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        rv = findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(linearLayoutManager);
        MyAdapter myAdapter = new MyAdapter(RecyclerViewExample.this,image,name,time);
        rv.setAdapter(myAdapter);
    }
}