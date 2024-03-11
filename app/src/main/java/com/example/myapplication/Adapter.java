package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AndroidException;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Adapter extends AppCompatActivity {
    GridView lv;
    Button btn;
    EditText txt;
    ArrayList<String>arrayList;
    Spinner sp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        lv = findViewById(R.id.listview);
        btn = findViewById(R.id.button);
        arrayList = new ArrayList<>();
        sp = findViewById(R.id.spinner);
        txt = findViewById(R.id.editTextText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = txt.getText().toString();
                arrayList.add(name);
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(Adapter.this, android.R.layout.simple_list_item_1,arrayList);
                lv.setAdapter(arrayAdapter);
                sp.setAdapter(arrayAdapter);
            }
        });
    }
}