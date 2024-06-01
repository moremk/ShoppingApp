package com.example.cloudtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.pink)));
        setContentView(R.layout.activity_main7);



    }
    @Override
    public boolean onCreatePanelMenu(int featureId, Menu m)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,m);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int itemId=item.getItemId();
        if(itemId==R.id.about)
        {
            Toast.makeText(getApplicationContext(),"About Page",Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(itemId==R.id.contact) {
            Intent intent=new Intent(getApplicationContext(), MainActivity7.class);
            startActivity(intent);
            return true;
        }
        else if(itemId==R.id.signin) {
            Intent intent=new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(intent);
            return true;
        }
        else if(itemId==R.id.signout)
        {
            Intent intent1=new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent1);
            return true;
        }
        return true;
    }
}