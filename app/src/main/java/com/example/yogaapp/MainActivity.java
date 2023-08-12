package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    String caution;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                // if No error is found then only it will run
                if (i != TextToSpeech.ERROR) {
                    // To Choose language of speech
                    textToSpeech.setLanguage(Locale.ENGLISH);
                }
            }
        });
    }

    public void bala(View view) {
        caution = getString(R.string.childcaution);
        Toast.makeText(this, caution, Toast.LENGTH_SHORT).show();
        textToSpeech.speak(caution, TextToSpeech.QUEUE_FLUSH, null);
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }

    public void taruna(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }

    public void praudha(View view) {
        caution = getString(R.string.riskcaution);
        Toast.makeText(this, caution, Toast.LENGTH_SHORT).show();
        textToSpeech.speak(caution, TextToSpeech.QUEUE_FLUSH, null);
        Intent intent = new Intent(MainActivity.this,SecondActivity3.class);
        startActivity(intent);
    }

    public void specific(View view) {
        Intent intent = new Intent(MainActivity.this,Specific.class);
        startActivity(intent);
    }
}