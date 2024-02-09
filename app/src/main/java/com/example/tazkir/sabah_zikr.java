package com.example.tazkir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class sabah_zikr extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabah_zikr);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        displayMessage();
    }
    public void displayMessage(){
//        TextView display_text= (TextView) findViewById(R.id.display);
        Intent intent = getIntent();
        String message = intent.getStringExtra("Message");
//        display_text.setText(message);
    }

//    public void onClick(View view) {
//        Button mytext= findViewById(R.id.button2);
//        mytext.setText(numberofclicks);
//        numberofclicks++;
//    }
}