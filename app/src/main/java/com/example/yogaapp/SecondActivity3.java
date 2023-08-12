package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second3);
    }

    public void warmup(View view) {
        Intent intent = new Intent(SecondActivity3.this,Warmup3.class);
        startActivity(intent);
    }

    public void cleansing(View view) {
        Intent intent = new Intent(SecondActivity3.this,Cleansing3.class);
        startActivity(intent);
    }

    public void asanas(View view) {
        Intent intent = new Intent(SecondActivity3.this,Asanas3.class);
        startActivity(intent);
    }

    public void pranayama(View view) {
        Intent intent = new Intent(SecondActivity3.this,Pranayama1.class);
        startActivity(intent);
    }

    public void mudras(View view) {
        Intent intent = new Intent(SecondActivity3.this,Mudras1.class);
        startActivity(intent);
    }

}