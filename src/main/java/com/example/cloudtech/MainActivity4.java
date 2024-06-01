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
import android.widget.EditText;
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity4 extends AppCompatActivity {
    Button b;
    EditText description,amount,phone,adress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.pink)));
        setContentView(R.layout.activity_main4);

        Pay p=new Pay(this);

        b = (Button)findViewById(R.id.b1);
        description = (EditText)findViewById(R.id.ed1);
        amount = (EditText)findViewById(R.id.ed2);
        phone = (EditText)findViewById(R.id.ed3);
        adress = (EditText)findViewById(R.id.ed4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = description.getText().toString();
                String mobile = phone.getText().toString();
                String area  = adress.getText().toString();
                String samount = amount.getText().toString();
                Boolean check=p.addPay(name,mobile,area,samount);
                if(name.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter Name here..",Toast.LENGTH_SHORT).show();
                }
                else if(mobile.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter Mobile here..",Toast.LENGTH_SHORT).show();
                }
                else if(area.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter Adress here..",Toast.LENGTH_SHORT).show();
                }
                else if(samount.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter Valid Amount here..",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Booking SuccessFull Do Complete Your Payment",Toast.LENGTH_SHORT).show();
                }



                int amount = Math.round(Float.parseFloat(samount) * 100);
                Checkout checkout = new Checkout();
                checkout.setKeyID("rzp_test_dLnxh91UDe5VJx");
                checkout.setImage(R.drawable.m);
                JSONObject object = new JSONObject();
                try {

                    object.put("name", "Mahesh More");
                    object.put("description", "Test payment");
                    object.put("theme.color", "pink");
                    object.put("currency", "INR");
                    object.put("amount", amount);
                    object.put("prefill.contact", "9322974643");
                    object.put("prefill.email", "moremk2019@gmail.com");
                    checkout.open(MainActivity4.this, object);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });


    }
    public void onPaymentSuccess(String s) {
        // this method is called on payment success.
        Toast.makeText(this, "Payment is successful : " + s, Toast.LENGTH_SHORT).show();
    }


    public void onPaymentError(int i, String s) {
        // on payment failed.
        Toast.makeText(this, "Payment Failed due to error : " + s, Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreatePanelMenu(int featureId,Menu m)
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