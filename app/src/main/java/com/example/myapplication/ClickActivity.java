package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ClickActivity extends AppCompatActivity {
    TextView tv;
    Button btn;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textView);
        iv = findViewById(R.id.imageView);
        iv.setOnClickListener(v -> {
            Intent i = new Intent(ClickActivity.this, Demo.class);
            startActivity(i);
        });
        btn.setOnClickListener(v -> {
            tv.setText("Android New Version");
        });
    }
}