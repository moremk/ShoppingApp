package com.example.cloudtech;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button b;
    EditText email,pass;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.pink)));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.b1);
        tv=(TextView)findViewById(R.id.tv1);
        email=(EditText)findViewById(R.id.ed1);
        pass=(EditText)findViewById(R.id.ed2);



        DBHelper db=new DBHelper(this);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String em=email.getText().toString();
                String ps=pass.getText().toString();
                if(em.equals("")||ps.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Enter All Fields",Toast.LENGTH_LONG).show();
                }
                else if(pass.equals(pass)){
                    Boolean check= db.password(em,ps);

                        if(check==true)
                        {
                            Toast.makeText(getApplicationContext(),"login Successfully",Toast.LENGTH_LONG).show();
                            Intent i=new Intent(getApplicationContext(), MainActivity3.class);
                            startActivity(i);
                        }
                        else  {
                            Toast.makeText(getApplicationContext(),"User Not Found",Toast.LENGTH_LONG).show();
                        }

                }

            }

        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(i);
            }
        });
    }
}