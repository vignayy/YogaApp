package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;


public class Open1d extends AppCompatActivity {
    String buttonvalue;
    Button startBtn;
    private CountDownTimer countDownTimer;
    TextView mtextview;
    private boolean MTimeRunning = false;
    private  long MTimeLeftinmillis;

    Button listenBtn;
    Button stopBtn;
    String description;
    TextToSpeech textToSpeech;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open1d);

        Intent intent  = getIntent();
        buttonvalue = intent.getStringExtra("value");
        int intvalue = Integer.valueOf(buttonvalue);

        switch (intvalue){
            case 1 :
                setContentView(R.layout.pry1);
                description = getString(R.string.ppose1);
                break;
            case 2 :
                setContentView(R.layout.pry2);
                description = getString(R.string.ppose2);
                break;
            case 3 :
                setContentView(R.layout.pry3);
                description = getString(R.string.ppose3);
                break;
            case 4 :
                setContentView(R.layout.pry4);
                description = getString(R.string.ppose4);
                break;
            case 5 :
                setContentView(R.layout.pry5);
                description = getString(R.string.ppose5);
                break;
            case 6 :
                setContentView(R.layout.pry6);
                description = getString(R.string.ppose6);
                break;
            case 7 :
                setContentView(R.layout.pry7);
                description = getString(R.string.ppose7);
                break;
            case 8 :
                setContentView(R.layout.pry8);
                description = getString(R.string.ppose8);
                break;
            case 9 :
                setContentView(R.layout.pry9);
                description = getString(R.string.ppose9);
                break;
            case 10 :
                setContentView(R.layout.pry10);
                description = getString(R.string.ppose10);
                break;
            case 11 :
                setContentView(R.layout.pry11);
                description = getString(R.string.ppose11);
                break;
            case 12 :
                setContentView(R.layout.pry12);
                description = getString(R.string.ppose12);
                break;
            default:
                setContentView(R.layout.sample);
                description = "Error";
                break;
        }

        startBtn = findViewById(R.id.strtbtn);
        mtextview = findViewById(R.id.timer);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MTimeRunning){
                    stopTimer();
                }
                else {
                    startTimer();
                }
            }
        });
        //VOICE DESCRIPTION
        listenBtn = findViewById(R.id.lstnBtn);
        stopBtn = findViewById(R.id.stopBtn);
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
        listenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Use the string resource for text-to-speech
                textToSpeech.speak(description, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Stop the speech when the stop button is clicked
                if (textToSpeech != null && textToSpeech.isSpeaking()) {
                    textToSpeech.stop();
                }
            }
        });
    }
    private void stopTimer(){
        countDownTimer.cancel();
        MTimeRunning = false;
        startBtn.setText("START");
    }
    private void startTimer(){
        final  CharSequence value1 = mtextview.getText();
        String num1 = value1.toString();
        String num2 = num1.substring(0,2);
        String num3 = num1.substring(3,5);

        final  int number = Integer.valueOf(num2) * 60 + Integer.valueOf(num3);
        MTimeLeftinmillis = number * 1000;

        countDownTimer = new CountDownTimer(MTimeLeftinmillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                MTimeLeftinmillis = millisUntilFinished;
                updateTimer();
            }

            @Override
            public void onFinish() {
                if (textToSpeech != null) {
                    textToSpeech.stop();
                    textToSpeech.shutdown();
                }
                int newvalue = Integer.valueOf(buttonvalue) + 1;
                if (newvalue <= 12){
                    Intent intent = new Intent(Open1d.this, Open1d.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value",String.valueOf(newvalue));
                    startActivity(intent);
                }
                else {
                    newvalue = 1;
                    Intent intent = new Intent(Open1d.this,Pranayama1.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value",String.valueOf(newvalue));
                    startActivity(intent);
                }
            }
        }.start();
        startBtn.setText("PAUSE");
        MTimeRunning = true;
    }

    private void updateTimer(){
        int minutes = (int) MTimeLeftinmillis / 600000;
        int seconds = (int) MTimeLeftinmillis % 60000 / 1000;
        String timeLeftText = "";
        if(minutes < 10) timeLeftText += "0";
        timeLeftText +=  minutes + ":";
        if (seconds < 10) timeLeftText += "0";
        timeLeftText += seconds;
        mtextview.setText(timeLeftText);
    }

    @Override
    public  void onBackPressed() {
        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onBackPressed();
    }

}