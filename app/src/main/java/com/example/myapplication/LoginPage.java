package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    Button loginbtn;
    TextView tx1,tx2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        loginbtn = findViewById(R.id.button);
        tx1 = findViewById(R.id.tx1);
        tx2 = findViewById(R.id.tx2);
        SharedPreferences sharedPreferences = getSharedPreferences("myfile",Context.MODE_PRIVATE);
        boolean b = sharedPreferences.getBoolean("IsLogin",false);
        if (b){
            Intent i = new Intent(LoginPage.this, RecyclerViewExample.class);
            startActivity(i);
            finish();
        }
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = tx1.getText().toString();
                String p1 = tx2.getText().toString();
                SharedPreferences sharedPreferences = getSharedPreferences("myfile", Context.MODE_PRIVATE);
                String name = sharedPreferences.getString("name",null);
                String password = sharedPreferences.getString("password",null);
                if(n1.equals(name) && p1.equals(password)){
                    SharedPreferences.Editor ed = sharedPreferences.edit();
                    ed.putBoolean("IsLogin",true);
                    ed.apply();
                    Toast.makeText(LoginPage.this,"Login Successfully",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(LoginPage.this, RecyclerViewExample.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(LoginPage.this,"Login Failed",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}