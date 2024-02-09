package com.example.tazkir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class masaa_zikr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masaa_zikr);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        displayMessage();
    }
    public void displayMessage(){
        Intent intent = getIntent();
        String message = intent.getStringExtra("Message");

    }
}