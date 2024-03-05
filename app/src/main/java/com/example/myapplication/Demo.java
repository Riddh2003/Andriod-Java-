package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Demo extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    CheckBox c1,c2;
    RadioGroup rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        c1 = findViewById(R.id.checkBox);
        c2 = findViewById(R.id.checkBox2);
        c1.setOnCheckedChangeListener(this);
        c2.setOnCheckedChangeListener(this);
        rb = findViewById(R.id.rg);
        rb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int id) {
                RadioButton rb = findViewById(id);
                if(id == R.id.radioButton){
                    Toast.makeText(Demo.this,"Selected  : "+rb.getText().toString(),Toast.LENGTH_LONG).show();
                }
                else if(id == R.id.radioButton2) {
                    Toast.makeText(Demo.this,"Selected  : "+rb.getText().toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(buttonView == c1){
            if(isChecked){
                Toast.makeText(getApplicationContext(),"Checked : "+c1.getText().toString(),Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(getApplicationContext(),"unChecked : "+c1.getText().toString(),Toast.LENGTH_LONG).show();
            }

        } else if (buttonView == c2) {
            if(isChecked){
                Toast.makeText(getApplicationContext(),"Checked : "+c2.getText().toString(),Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(getApplicationContext(),"unChecked : "+c2.getText().toString(),Toast.LENGTH_LONG).show();
            }
        }
    }
}