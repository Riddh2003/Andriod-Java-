package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
    Button homebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        homebtn = findViewById(R.id.button2);
        homebtn.setOnClickListener(v -> {
            Intent i = new Intent(HomePage.this,RegistrationPage.class);
            startActivity(i);
        });
    }
}