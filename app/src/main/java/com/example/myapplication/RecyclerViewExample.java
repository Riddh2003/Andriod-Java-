package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem m1 = menu.add(0,0,0,"Logout");
        m1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(@NonNull MenuItem item) {
                if(item.getItemId()==0){
                    SharedPreferences sharedPreferences = getSharedPreferences("myfile", Context.MODE_PRIVATE);
                    SharedPreferences.Editor ed = sharedPreferences.edit();
                    ed.putBoolean("IsRegister",false);
                    ed.putBoolean("IsLogin",false);
                    ed.apply();
                    Intent i = new Intent(RecyclerViewExample.this, RegistrationPage.class);
                    startActivity(i);
                }
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}