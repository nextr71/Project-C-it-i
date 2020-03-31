package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import www.sanju.motiontoast.MotionToast;

public class MainActivity extends AppCompatActivity {

    private Button button1,button2,button3,button4,button5,buttonD1,buttonD2,buttonD3,buttonD4,buttonD5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Animation Toast");

        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);

        buttonD1=findViewById(R.id.buttonDark1);
        buttonD2=findViewById(R.id.buttonDark2);
        buttonD3=findViewById(R.id.buttonDark3);
        buttonD4=findViewById(R.id.buttonDark4);
        buttonD5=findViewById(R.id.buttonDark5);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MotionToast.Companion.createColorToast(MainActivity.this,"Upload Completed!",
                        MotionToast.Companion.getTOAST_SUCCESS(),
                        MotionToast.Companion.getGRAVITY_BOTTOM(),
                        MotionToast.Companion.getLONG_DURATION(),
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MotionToast.Companion.createColorToast(MainActivity.this, "Please fill all the details!",
                        MotionToast.Companion.getTOAST_ERROR(),
                        MotionToast.Companion.getGRAVITY_BOTTOM(),
                        MotionToast.Companion.getLONG_DURATION(),
                        ResourcesCompat.getFont(MainActivity.this, R.font.helvetica_regular));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MotionToast.Companion.createColorToast(MainActivity.this,"Please fill all the details!",
                        MotionToast.Companion.getTOAST_WARNING(),
                        MotionToast.Companion.getGRAVITY_BOTTOM(),
                        MotionToast.Companion.getLONG_DURATION(),
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MotionToast.Companion.createColorToast(MainActivity.this,"This is information toast!",
                        MotionToast.Companion.getTOAST_INFO(),
                        MotionToast.Companion.getGRAVITY_BOTTOM(),
                        MotionToast.Companion.getLONG_DURATION(),
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MotionToast.Companion.createColorToast(MainActivity.this,"Delete all history!",
                        MotionToast.Companion.getTOAST_DELETE(),
                        MotionToast.Companion.getGRAVITY_BOTTOM(),
                        MotionToast.Companion.getLONG_DURATION(),
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });


        buttonD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MotionToast.Companion.darkColorToast(MainActivity.this,"Upload Completed!",
                        MotionToast.Companion.getTOAST_SUCCESS(),
                        MotionToast.Companion.getGRAVITY_BOTTOM(),
                        MotionToast.Companion.getLONG_DURATION(),
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });

        buttonD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MotionToast.Companion.darkColorToast(MainActivity.this, "Please fill all the details!",
                        MotionToast.Companion.getTOAST_ERROR(),
                        MotionToast.Companion.getGRAVITY_BOTTOM(),
                        MotionToast.Companion.getLONG_DURATION(),
                        ResourcesCompat.getFont(MainActivity.this, R.font.helvetica_regular));
            }
        });

        buttonD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MotionToast.Companion.darkColorToast(MainActivity.this,"Please fill all the details!",
                        MotionToast.Companion.getTOAST_WARNING(),
                        MotionToast.Companion.getGRAVITY_BOTTOM(),
                        MotionToast.Companion.getLONG_DURATION(),
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });

        buttonD4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MotionToast.Companion.darkColorToast(MainActivity.this,"This is information toast!",
                        MotionToast.Companion.getTOAST_INFO(),
                        MotionToast.Companion.getGRAVITY_BOTTOM(),
                        MotionToast.Companion.getLONG_DURATION(),
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });

        buttonD5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MotionToast.Companion.darkColorToast(MainActivity.this,"Delete all history!",
                        MotionToast.Companion.getTOAST_DELETE(),
                        MotionToast.Companion.getGRAVITY_BOTTOM(),
                        MotionToast.Companion.getLONG_DURATION(),
                        ResourcesCompat.getFont(MainActivity.this,R.font.helvetica_regular));
            }
        });
    }


}
