package com.example.cloudtech;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,bb4,bb5,bb6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.pink)));
        setContentView(R.layout.activity_main5);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        bb4=(Button) findViewById(R.id.bb4);
        bb5=(Button) findViewById(R.id.bb5);
        bb6=(Button) findViewById(R.id.bb6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(i);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(i);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(i);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(i);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(i);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(i);
            }
        });
        bb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1 = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(i1);
            }
        });
        bb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i2 = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(i2);
            }
        });
        bb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i3 = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(i3);
            }
        });

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