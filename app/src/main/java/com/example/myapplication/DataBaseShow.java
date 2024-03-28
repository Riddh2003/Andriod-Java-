package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataBaseShow extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<User> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_base_show);
        rv = findViewById(R.id.rv);
        arrayList = new ArrayList<User>();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(linearLayoutManager);
        DBHelper dbHelper = new DBHelper(DataBaseShow.this);
        arrayList = (ArrayList<User>) dbHelper.show();
        RVAdapter rvAdapter = new RVAdapter(DataBaseShow.this,arrayList);
        rv.setAdapter(rvAdapter);
    }
}