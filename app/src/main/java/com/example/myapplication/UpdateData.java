package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UpdateData extends AppCompatActivity {
    EditText tx1,tx2,tx3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_data);
        tx1 = findViewById(R.id.editTextText1);
        tx2 = findViewById(R.id.editTextText2);
        tx3 = findViewById(R.id.editTextText3);
        btn = findViewById(R.id.button);
        Intent i = getIntent();
        int id = i.getIntExtra("id",0);
        String fname = i.getStringExtra("fname");
        String lname = i.getStringExtra("lname");
        String pass = i.getStringExtra("pass");
        tx1.setText(fname);
        tx2.setText(lname);
        tx3.setText(pass);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname =  tx1.getText().toString();
                String lname  = tx2.getText().toString();
                String pass = tx3.getText().toString();
                User user = new User();
                user.setId(id);
                user.setFname(fname);
                user.setLname(lname);
                user.setPassword(pass);
                DBHelper dbHelper = new DBHelper(UpdateData.this);
                dbHelper.update(user);
                Toast.makeText(UpdateData.this,"Data Updated",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(UpdateData.this,DataBaseShow.class);
                startActivity(i);
            }
        });
    }
}