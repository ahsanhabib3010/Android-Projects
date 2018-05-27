package com.example.ahsanhabib.sqlitedatabase_15_12_17;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "EMS.db";
    public static final String TABLE_NAME = "Employee";

    public DatabaseHelper(Context context){
        super(context,DATABASE_NAME,null,1);

        SQLiteDatabase db = this.getReadableDatabase();

    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " +TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, MOBILE_NUMBER INTEGER, EMAIL TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME);
        onCreate(db);
    }

    public boolean insertEmployee(String name, int mobile, String email){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();

        contentValues.put("NAME" , name);
        contentValues.put("MOBILE_NUMBER" , mobile);
        contentValues.put("EMAIL" , email);

        long result = db.insert("Employee", null, contentValues);

        if (result == -1){
            return false;
        }
        else
            return true;
    }


    public boolean updateEmployee(String name, String phone, String email) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();

        contentValues.put("NAME" , name);
        contentValues.put("EMAIL" , email);

        db.update(TABLE_NAME, contentValues, "MOBILE_NUMBER = '" +phone+ "' ",null);
        db.close();
        return true;
    }


    public Cursor getData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " +TABLE_NAME, null);
        return res;
    }


    public boolean deleteEmployee(String id){
        SQLiteDatabase db = this.getWritableDatabase();

        long result = db.delete(TABLE_NAME,"ID = '" +id+ "' " ,null);

        if (result == -1){
            db.close();
            return false;
        }
        else{
            db.close();
            return true;
        }
    }
}
