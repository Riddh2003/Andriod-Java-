package com.example.myapplication;

import android.content.Context;
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
    static RecyclerView rv;
    static ArrayList<User> arrayList;
    static Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_data_base_show);
        rv = findViewById(R.id.rv);
        arrayList = new ArrayList<User>();
        refresh();
    }
    public static void refresh(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        rv.setLayoutManager(linearLayoutManager);
        DBHelper dbHelper = new DBHelper(context);
        arrayList = (ArrayList<User>) dbHelper.show();
        RVAdapter rvAdapter = new RVAdapter(context,arrayList);
        rv.setAdapter(rvAdapter);
    }
}