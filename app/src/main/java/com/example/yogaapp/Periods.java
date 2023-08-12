package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Periods extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periods);

        newArray = new int[]{
                R.id.prd1, R.id.prd2, R.id.prd3, R.id.prd4, R.id.prd5
        };
    }

    public void clicked(View view) {
        for (int i=0; i<newArray.length; i++){
            if(view.getId() == newArray[i]){
                int value = i+1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent;
                intent = new Intent(Periods.this,Openprds.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}