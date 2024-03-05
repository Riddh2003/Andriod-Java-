package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        registerForContextMenu(btn);
//        Fragment1 fragment1 = new Fragment1();
//        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        ft.replace(R.id.frmid,fragment1);
//        ft.commit();
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,btn2);
                popupMenu.getMenuInflater().inflate(R.menu.main,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if(item.getItemId() == R.id.id1){
                            Toast.makeText(MainActivity.this,"Selected : "+item.getTitle(),Toast.LENGTH_LONG).show();
                        }
                        else if(item.getItemId() == R.id.id2){
                            Toast.makeText(MainActivity.this,"Selected : "+item.getTitle(),Toast.LENGTH_LONG).show();
                        }
                        else if(item.getItemId() == R.id.id3){
                            Toast.makeText(MainActivity.this,"Selected : "+item.getTitle(),Toast.LENGTH_LONG).show();
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });
    }

//    @Override
//    public void onBackPressed() {
//        if(getSupportFragmentManager().getBackStackEntryCount()>0){
//            getSupportFragmentManager().popBackStack();
//        }
//        else{
//            super.onBackPressed();
//        }
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.id1){
            Toast.makeText(this,"Selected : "+item.getTitle(),Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId() == R.id.id2){
            Toast.makeText(this,"Selected : "+item.getTitle(),Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId() == R.id.id3){
            Toast.makeText(this,"Selected : "+item.getTitle(),Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId() == R.id.id4){
            Toast.makeText(MainActivity.this,"Selected : "+item.getTitle(),Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId() == R.id.id5){
            Toast.makeText(MainActivity.this,"Selected : "+item.getTitle(),Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.main,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.id1){
            Toast.makeText(this,"Selected : "+item.getTitle(),Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId() == R.id.id2){
            Toast.makeText(this,"Selected : "+item.getTitle(),Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId() == R.id.id3){
            Toast.makeText(this,"Selected : "+item.getTitle(),Toast.LENGTH_LONG).show();
        }
        return super.onContextItemSelected(item);
    }
}