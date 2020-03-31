package com.example.popupdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private Activity activity;

    private LinearLayout linearLayout;
    private Button popUpButton;

    private PopupWindow popUpWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=getApplicationContext();
        activity=MainActivity.this;

        linearLayout=findViewById(R.id.linearLayoutId);
        popUpButton=findViewById(R.id.popUpButton);

        popUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater inflater= (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
                View view=inflater.inflate(R.layout.popup_layout,null);

                popUpWindow=new PopupWindow(view,LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);

                if(Build.VERSION.SDK_INT>=21){
                    popUpWindow.setElevation(5.0f);
                }
                ImageButton cancleButton=view.findViewById(R.id.cancleButtonId);
                cancleButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popUpWindow.dismiss();
                    }
                });
                popUpWindow.showAtLocation(linearLayout, Gravity.CENTER_VERTICAL,0,0);


            }
        });
    }
}
