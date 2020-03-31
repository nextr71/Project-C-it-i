package com.example.imageload;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageViewId);

        Glide.with(this).load("data:image/jpeg;base64,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").into(imageView);
    }
}