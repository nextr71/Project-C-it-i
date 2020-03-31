package com.example.usingbandle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.textViewId);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String country=bundle.getString("name");
            show(country);
        }
    }
    void show(String country){
        if(country.equals("afghanstan")){
            textView.setText(R.string.afghanstanTxt);
        }else if(country.equals("bangladesh")){
            textView.setText(R.string.bangladeshTxt);
        }else if(country.equals("pakistan")){
            textView.setText(R.string.pakistanTxt);
        }
    }
}
