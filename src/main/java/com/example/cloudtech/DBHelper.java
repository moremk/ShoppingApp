package com.example.cloudtech;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    private static final String db_name="shop";
    public DBHelper(Context c)
    {
        super(c,db_name,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="create table register(name text Primary Key,email text,pass int,mobile int)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("Drop table exisist");
        onCreate(db);
    }

    public boolean addData(String name, String email, String pass, String mobile)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues v=new ContentValues();
        v.put("name",name);
        v.put("email",email);
        v.put("pass",pass);
        v.put("mobile",mobile);
        long result=db.insert("register",null,v);
        return false;
    }
    public Boolean username(String email)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor c=db.rawQuery("select * from register where email=?",new String[]{email});
        if(c.getCount()>0)
            return true;
        else
            return false;
    }
    public Boolean password(String email,String pass)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor c=db.rawQuery("select * from register where email=? and pass=?",new String[]{email,pass});
        if(c.getCount()>0)
            return true;
        else
            return false;
    }

}
