package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void warmup(View view) {
        Intent intent = new Intent(SecondActivity.this,Warmup1.class);
        startActivity(intent);
    }

    public void cleansing(View view) {
        Intent intent = new Intent(SecondActivity.this,Cleansing1.class);
        startActivity(intent);
    }

    public void asanas(View view) {
        Intent intent = new Intent(SecondActivity.this,Asanas1.class);
        startActivity(intent);
    }

    public void pranayama(View view) {
        Intent intent = new Intent(SecondActivity.this,Pranayama1.class);
        startActivity(intent);
    }

    public void mudras(View view) {
        Intent intent = new Intent(SecondActivity.this,Mudras1.class);
        startActivity(intent);
    }
}