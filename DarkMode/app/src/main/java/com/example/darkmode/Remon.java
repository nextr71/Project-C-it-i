package com.example.darkmode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;

public class Remon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.darkTheme);
        }else{
            setTheme(R.style.AppsTheme);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remon);
    }
}
