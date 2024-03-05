package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class LoginPage_Framelayout extends AppCompatActivity {
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page_framelayout);
        tx = findViewById(R.id.textView8);
        tx.setOnClickListener(v -> {
            Intent i = new Intent(LoginPage_Framelayout.this,RegistrationPage_Framelayout.class);
            startActivity(i);
        });
    }
}