package com.example.cloudtech;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button b;
    EditText name,email,pass,mobile;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.pink)));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=(EditText)findViewById(R.id.ed1);
        email=(EditText)findViewById(R.id.ed2);
        pass=(EditText)findViewById(R.id.ed3);
        mobile=(EditText)findViewById(R.id.ed4);
        b=(Button)findViewById(R.id.b1);

        DBHelper db=new DBHelper(this);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nm=name.getText().toString();
                String em=email.getText().toString();
                String ps=pass.getText().toString();
                String mb=mobile.getText().toString();
                boolean check=db.addData(nm,em,ps,mb);
                if(nm.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter Your Name",Toast.LENGTH_LONG).show();
                } else if (em.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Your Email",Toast.LENGTH_LONG).show();
                }
                else if (ps.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Your Password",Toast.LENGTH_LONG).show();
                }
                else if (mb.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Your Contact",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"you are Successfully Register",Toast.LENGTH_LONG).show();
                    Intent i=new Intent(getApplicationContext(),MainActivity3.class);
                    startActivity(i);

                }

            }
        });

    }
}