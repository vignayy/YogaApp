package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Pranayama1 extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pranayama1);

        newArray = new int[]{
                R.id.prn1, R.id.prn2, R.id.prn3, R.id.prn4, R.id.prn5, R.id.prn6, R.id.prn7,
                R.id.prn8, R.id.prn9, R.id.prn10, R.id.prn11, R.id.prn12
        };
    }

    public void clicked(View view) {
        for (int i=0; i<newArray.length; i++){
            if(view.getId() == newArray[i]){
                int value = i+1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(Pranayama1.this,Open1d.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);
            }
        }
    }
//    public void onBackPressed() {
//        Intent intent = new Intent(this, SecondActivity.class);
//        startActivity(intent);
//    }
}