package com.example.cloudtech;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Pay extends SQLiteOpenHelper {

    private static final String db_name="pay";
    public Pay(Context context)
    {
        super(context,db_name,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String q="create table client(name text Primary key,amount text,mobile text,adress text)";
        db.execSQL(q);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("Drop table exist");
        onCreate(db);

    }
    public boolean addPay(String name,String amount,String mobile,String adress)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues v=new ContentValues();
        v.put("name",name);
        v.put("amount",amount);
        v.put("mobile",mobile);
        v.put("adress",adress);
        return true;
    }
}
