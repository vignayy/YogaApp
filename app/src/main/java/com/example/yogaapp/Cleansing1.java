package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Cleansing1 extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleansing1);

        newArray = new int[]{
                R.id.clean1, R.id.clean2, R.id.clean3, R.id.clean4, R.id.clean5, R.id.clean6, R.id.clean7,
                R.id.clean8
        };
    }

    public void clicked(View view) {
        for (int i=0; i<newArray.length; i++){
            if(view.getId() == newArray[i]){
                int value = i+1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(Cleansing1.this,Open1b.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}