package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class RegistrationPage_Framelayout extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page_framelayout);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(v -> {
            Intent i = new Intent(RegistrationPage_Framelayout.this, LoginPage_Framelayout.class);
            startActivity(i);
        });
    }
}