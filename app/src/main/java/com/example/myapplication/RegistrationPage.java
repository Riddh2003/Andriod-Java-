package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationPage extends AppCompatActivity {
    Button regbtn;
    EditText tx1,tx2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);
        regbtn = findViewById(R.id.button);
        tx1 = findViewById(R.id.tx1);
        tx2 = findViewById(R.id.tx2);
        //IsRegister
        SharedPreferences sharedPreferences = getSharedPreferences("myfile",Context.MODE_PRIVATE);
        boolean b = sharedPreferences.getBoolean("IsRegister",false);
        if(b){
            Intent i = new Intent(RegistrationPage.this,LoginPage.class);
            startActivity(i);
            finish();
        }
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = tx1.getText().toString();
                String password = tx2.getText().toString();
                SharedPreferences sharedPreference = getSharedPreferences("myfile", Context.MODE_PRIVATE);
                SharedPreferences.Editor ed = sharedPreference.edit();
                ed.putString("name",uname);
                ed.putString("password",password);
                ed.putBoolean("IsRegister",true);
                ed.apply();
                Intent i = new Intent(RegistrationPage.this,LoginPage.class);
                startActivity(i);
            }
        });
    }
}