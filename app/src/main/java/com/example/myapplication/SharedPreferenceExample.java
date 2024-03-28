package com.example.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SharedPreferenceExample extends AppCompatActivity {
    Button btn1,btn2;
    TextView textView;
    EditText tx1,tx2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
        tx1 = findViewById(R.id.tx1);
        tx2 = findViewById(R.id.tx2);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = tx1.getText().toString();
                String pass = tx2.getText().toString();
                SharedPreferences sharedPreference = getSharedPreferences("myfile", Context.MODE_PRIVATE);
                SharedPreferences.Editor ed = sharedPreference.edit();
                ed.putString("name", uname);
                ed.putString("password", pass);
                ed.apply();
                Toast.makeText(SharedPreferenceExample.this, "SAVE", Toast.LENGTH_LONG).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("myfile", Context.MODE_PRIVATE);
                String name = sharedPreferences.getString("name", null);
                String password = sharedPreferences.getString("password", null);
                textView.setText(name + " : " + password);
            }
        });
    }
}