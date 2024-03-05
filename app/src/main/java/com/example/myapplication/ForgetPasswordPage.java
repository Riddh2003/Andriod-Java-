package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class ForgetPasswordPage extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password_page);
        btn = findViewById(R.id.button3);
        btn.setOnClickListener(v -> {
            Intent i = new Intent(ForgetPasswordPage.this,LoginPage.class);
            startActivity(i);
            Toast.makeText(getApplicationContext(),"New Password Created",Toast.LENGTH_LONG).show();
        });
    }
}