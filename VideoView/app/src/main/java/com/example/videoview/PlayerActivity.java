package com.example.videoview;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;
    MediaController mediaController;

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        mediaController=new MediaController(this);

        videoView=findViewById(R.id.videoViewId);

        //String videoLink=getIntent().getStringExtra("video");
        //videoView.setVideoPath(videoLink);

        videoView.setVideoURI(Uri.parse("android.resource://"+getOpPackageName()+"/"+R.raw.hamde_bari_tayala));

        videoView.requestFocus();
        videoView.start();
        videoView.setMediaController(mediaController);
    }
}
