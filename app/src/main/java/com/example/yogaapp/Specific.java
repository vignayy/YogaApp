package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Specific extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specific);
    }
    public void mentalhealth(View view) {
        Intent intent = new Intent(Specific.this,Mentalhealth.class);
        startActivity(intent);
    }

    public void thyroid(View view) {
        Intent intent = new Intent(Specific.this,Thyroid.class);
        startActivity(intent);
    }

    public void pregnancy(View view) {
        Intent intent = new Intent(Specific.this,Pregnancy.class);
        startActivity(intent);
    }

    public void pcos(View view) {
        Intent intent = new Intent(Specific.this,Pcos.class);
        startActivity(intent);
    }

    public void periods(View view) {
        Intent intent = new Intent(Specific.this,Periods.class);
        startActivity(intent);
    }
}