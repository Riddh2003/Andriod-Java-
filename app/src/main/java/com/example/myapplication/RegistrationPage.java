package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class RegistrationPage extends AppCompatActivity {
    Button regbtn;
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);
        regbtn = findViewById(R.id.button);
        regbtn.setOnClickListener(v -> {
            Intent i=new Intent(RegistrationPage.this, LoginPage.class);
            startActivity(i);
        });
        tx = findViewById(R.id.textView4);
        tx.setOnClickListener(v -> {
            Intent i = new Intent(RegistrationPage.this,LoginPage.class);
            startActivity(i);
        });
    }
}