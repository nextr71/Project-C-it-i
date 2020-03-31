package com.example.usingbandle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button afghanstan, bangladesh, pakistan;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        afghanstan = findViewById(R.id.afghanstanId);
        bangladesh = findViewById(R.id.bangladeshId);
        pakistan = findViewById(R.id.pakistanId);

        afghanstan.setOnClickListener(this);
        bangladesh.setOnClickListener(this);
        pakistan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.afghanstanId) {
            intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("name", "afghanstan");
            startActivity(intent);
        } else if (v.getId() == R.id.bangladeshId) {
            intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("name", "bangladesh");
            startActivity(intent);
        } else if (v.getId() == R.id.pakistanId) {
            intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("name", "pakistan");
            startActivity(intent);
        }

    }
}
