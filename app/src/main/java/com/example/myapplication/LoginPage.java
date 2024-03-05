package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {
    Button loginbtn;
    TextView tx1,tx2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        loginbtn = findViewById(R.id.button);
        loginbtn.setOnClickListener(v -> {
            Intent i = new Intent(LoginPage.this,HomePage.class);
            startActivity(i);
        });
        tx1 = findViewById(R.id.textView4);
        tx1.setOnClickListener(v -> {
            Intent i = new Intent(LoginPage.this,ForgetPasswordPage.class);
            startActivity(i);
        });
        tx2 = findViewById(R.id.textView);
        tx2.setOnClickListener(v -> {
            Intent i = new Intent(LoginPage.this,RegistrationPage.class);
            startActivity(i);
        });
    }
}