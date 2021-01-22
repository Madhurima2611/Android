package com.example.response;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    ImageButton b1,b2,b3,b4,b5,b6;
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.ib1);
        b2=findViewById(R.id.ib2);
        b3=findViewById(R.id.ib3);
        b4=findViewById(R.id.ib4);
        b5=findViewById(R.id.ib5);
        b6=findViewById(R.id.ib6);
        t1=findViewById(R.id.tv1);
        t2=findViewById(R.id.tv2);
        t3=findViewById(R.id.tv3);
        t4=findViewById(R.id.tv4);
        t5=findViewById(R.id.tv5);
        t6=findViewById(R.id.tv6);
        t7=findViewById(R.id.date);
        t8=findViewById(R.id.time);
        @SuppressLint("SimpleDateFormat") SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        String currentDateandTime = sdf.format(new Date());
        t7.setText(currentDateandTime);
        @SuppressLint("SimpleDateFormat") SimpleDateFormat sd= new SimpleDateFormat("H:mm:ss");
        String timeset = sd.format(new Date());
        t8.setText(timeset);

    }
    public void Wclicked(View v) {
        Intent intn = new Intent(Intent.ACTION_SEND);
        intn.setType("text/plain");
        intn.setPackage("com.whatsapp");
        intn.putExtra(Intent.EXTRA_TEXT, "Helloooo");
        if (intn.resolveActivity(getPackageManager()) != null) {
            startActivity(intn);
        }
        else{
            Toast.makeText(getApplicationContext(), "no application found",Toast.LENGTH_LONG).show();
        }
    }
    public void Iclicked(View v){
        Intent intn = new Intent(Intent.ACTION_SEND);
        intn.setType("text/plain");
        intn.setPackage("com.instagram.android");
        intn.putExtra(Intent.EXTRA_TEXT, "Helloooo");
        if (intn.resolveActivity(getPackageManager()) != null) {
            startActivity(intn);
        }
        else{
            Toast.makeText(getApplicationContext(), "no application found",Toast.LENGTH_LONG).show();
        }
    }
    public void Fclicked(View v){
        Intent intn = new Intent(Intent.ACTION_SEND);
        intn.setType("text/plain");
        intn.setPackage("com.flipkart.android");
        intn.putExtra(Intent.EXTRA_TEXT, "Helloooo");
        if (intn.resolveActivity(getPackageManager()) != null) {
            startActivity(intn);
        }
        else{
            Toast.makeText(getApplicationContext(), "no application found",Toast.LENGTH_LONG).show();
        }
    }
    public void Gclicked(View v) {
        Intent intn = new Intent(Intent.ACTION_SEND);
        intn.setType("text/plain");
        intn.setPackage("com.google.android.gm");
        intn.putExtra(Intent.EXTRA_TEXT, "Helloooo");
        if (intn.resolveActivity(getPackageManager()) != null) {
            startActivity(intn);
        }
        else{
            Toast.makeText(getApplicationContext(), "no application found",Toast.LENGTH_LONG).show();
        }
    }
    public void Liclicked(View v){
        Intent intn = new Intent(Intent.ACTION_SEND);
        intn.setType("text/plain");
        intn.setPackage("com.Linkedin.android");
        intn.putExtra(Intent.EXTRA_TEXT, "Helloooo");
        if (intn.resolveActivity(getPackageManager()) != null) {
            startActivity(intn);
        }
        else{
            Toast.makeText(getApplicationContext(), "no application found",Toast.LENGTH_LONG).show();
        }
    }
    public void Fbclicked(View v){
        Intent intn = new Intent(Intent.ACTION_SEND);
        intn.setType("text/plain");
        intn.setPackage("com.facebook.orca");
        intn.putExtra(Intent.EXTRA_TEXT, "Helloooo");
        if (intn.resolveActivity(getPackageManager()) != null) {
            startActivity(intn);
        }
        else{
            Toast.makeText(getApplicationContext(), "no application found",Toast.LENGTH_LONG).show();
        }
    }

}