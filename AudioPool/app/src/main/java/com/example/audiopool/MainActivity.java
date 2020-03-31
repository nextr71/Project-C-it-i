package com.example.audiopool;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool sp;
    private int sound1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp=new SoundPool(2, AudioManager.STREAM_MUSIC,0);

        sound1=sp.load(getApplicationContext(),R.raw.fast_furious_9,1);

    }

    public void play(View view) {
        sp.play(sound1,1.0f,1.0f,0,0,1.0f);
    }
}
