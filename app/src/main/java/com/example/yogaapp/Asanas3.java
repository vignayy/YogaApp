package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Asanas3 extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asanas3);

        newArray = new int[]{
                R.id.asan1, R.id.asan2, R.id.asan3, R.id.asan4, R.id.asan5, R.id.asan6, R.id.asan7, R.id.asan8,
                R.id.asan9, R.id.asan10, R.id.asan11, R.id.asan12, R.id.asan13, R.id.asan14, R.id.asan15, R.id.asan16,
                R.id.asan17, R.id.asan18, R.id.asan19, R.id.asan20, R.id.asan21, R.id.asan22, R.id.asan23, R.id.asan24
        };
    }

    public void clicked(View view) {
        for (int i=0; i<newArray.length; i++){
            if(view.getId() == newArray[i]){
                int value = i+1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(Asanas3.this,Open3c.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}