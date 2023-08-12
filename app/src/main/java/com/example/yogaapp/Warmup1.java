package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Warmup1 extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warmup1);

        newArray = new int[]{
                R.id.warm1, R.id.warm2, R.id.warm3, R.id.warm4, R.id.warm5, R.id.warm6, R.id.warm7,
                R.id.warm8, R.id.warm9, R.id.warm10, R.id.warm11, R.id.warm12
        };
    }

    public void clicked(View view) {
        for (int i=0; i<newArray.length; i++){
            if(view.getId() == newArray[i]){
                int value = i+1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(Warmup1.this,Open1a.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}