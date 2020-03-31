package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private CheckBox java, kotline, dart;
    private Button selectButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        java = findViewById(R.id.javaButtonId);
        kotline = findViewById(R.id.kotlineButtonId);
        dart = findViewById(R.id.dartButtonId);

        selectButton = findViewById(R.id.selectButtonId);

        textView = findViewById(R.id.textView);

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder stringBuilder = new StringBuilder();

                if (java.isChecked()) {
                    String value = java.getText().toString();
                    stringBuilder.append(value + " is selected\n");
                }
                if (kotline.isChecked()) {
                    String value = kotline.getText().toString();
                    stringBuilder.append(value + " is selected\n");
                }
                if (dart.isChecked()) {
                    String value = dart.getText().toString();
                    stringBuilder.append(value + " is selected\n");
                }
                textView.setText(stringBuilder);
            }
        });
    }
}
