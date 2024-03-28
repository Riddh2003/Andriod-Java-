package com.example.myapplication;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;

public class Registration_Material extends AppCompatActivity {
    Button btn;
    Calendar c = Calendar.getInstance();
    TextInputEditText fn, ln, password, email, phone, area, address, birthday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_material);
        btn = findViewById(R.id.button);
        fn = findViewById(R.id.fn);
        ln = findViewById(R.id.ln);
        password = findViewById(R.id.password);
//        email = findViewById(R.id.email);
//        phone = findViewById(R.id.phone);
//        area = findViewById(R.id.area);
//        address = findViewById(R.id.address);
//        birthday = findViewById(R.id.birthday);
//        birthday.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new DatePickerDialog(Registration_Material.this, SETDATE, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show();
//            }
//        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Intent i = new Intent(Registration_Material.this, Card_details.class);
                String firstname = fn.getText().toString();
                String lastname = ln.getText().toString();
                String pass = password.getText().toString();
                User user = new User();
                user.setFname(firstname);
                user.setLname(lastname);
                user.setPassword(pass);
                DBHelper dbHelper = new DBHelper(Registration_Material.this);
                dbHelper.insert(user);
                Toast.makeText(Registration_Material.this,"Data Insert",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Registration_Material.this,DataBaseShow.class);
                startActivity(i);
//                String em = email.getText().toString();
//                String ph = phone.getText().toString();
//                String ar = area.getText().toString();
//                String add = address.getText().toString();
//                String bir = birthday.getText().toString();
//                SharedPreferences sharedPreferences = getSharedPreferences("myfile",Context.MODE_PRIVATE);
//                SharedPreferences.Editor ed = sharedPreferences.edit();
//                ed.putString("firstname",firstname);
//                ed.putString("lastname",lastname);
//                ed.putString("password",pass);
//                ed.putString("email",em);
//                ed.putString("phone",ph);
//                ed.putString("area",ar);
//                ed.putString("address",add);
//                ed.putString("birthday",bir);
//                ed.apply();
//                startActivity(i);
            }
        });
    }
//    private DatePickerDialog.OnDateSetListener SETDATE = new DatePickerDialog.OnDateSetListener(){
//        @Override
//        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//            birthday.setText(dayOfMonth+"/"+(month+1)+"/"+year);
//        }
//    };
}