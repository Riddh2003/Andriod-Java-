package com.example.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Card_details extends AppCompatActivity {
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_details);
        tx = findViewById(R.id.textView2);
        SharedPreferences sharedPreferences = getSharedPreferences("myfile", Context.MODE_PRIVATE);
        String firstname = sharedPreferences.getString("firstname",null);
        String lastname = sharedPreferences.getString("lastname",null);
        String password = sharedPreferences.getString("password",null);
        String email = sharedPreferences.getString("email",null);
        String phone = sharedPreferences.getString("phone",null);
        String area = sharedPreferences.getString("area",null);
        String address = sharedPreferences.getString("address",null);
        String birthday = sharedPreferences.getString("birthday",null);
        tx.setText("First Name: "+firstname+"\nLast Name: "+lastname+"\nPassword: "+password+"\nEmail: "+email+"\nPhone: "+phone+
                "\nArea: "+area+"\nAddress: "+address+"\nBirthday: "+birthday);
        tx.setHighlightColor(00000);
    }
}