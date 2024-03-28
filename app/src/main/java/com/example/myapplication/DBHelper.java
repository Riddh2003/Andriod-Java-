package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {
    public static String DBNAME ="mydb";
    public static String TABLE= "mytable";
    public static String ID = "ID";
    public static String FNAME = "fisrtname";
    public static String LNAME = "lastname";
    public static String PASSWORD = "password";
    public static int version = 1;
    public DBHelper(@Nullable Context context) {
        super(context, DBNAME, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE "+TABLE+"("+ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+FNAME+" TEXT,"+LNAME+" TEXT,"+PASSWORD+" TEXT)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void insert(User user){
        SQLiteDatabase db =getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(FNAME,user.getFname());
        contentValues.put(LNAME,user.getLname());
        contentValues.put(PASSWORD,user.getPassword());
        db.insert(TABLE,ID,contentValues);
        db.close();
    }
    List<User> show(){
        ArrayList<User> arrayList = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        String column[] ={ID,FNAME,LNAME,PASSWORD};
        Cursor c= db.query(TABLE,column,null,null,null,null,null);
        while (c.moveToNext()){
            int id = c.getInt(0);
            String fname = c.getString(1);
            String lname = c.getString(2);
            String password = c.getString(3);
            User user = new User();
            user.setId(id);
            user.setFname(fname);
            user.setLname(lname);
            user.setPassword(password);
            arrayList.add(user);
        }
        return arrayList;
    }
}
