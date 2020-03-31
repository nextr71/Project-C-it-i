package com.example.videoview;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    String video1="https://firebasestorage.googleapis.com/v0/b/datastore-eb3cd.appspot.com/o/videos%2FHamde%20Bari%20Tayala%20_%20Bangla%20Islamic%20Song%20_%20Iqbal%20Mahmud%20%26%20Mahfuzul%20Alam%20_%20Kalarab.mp4?alt=media&token=737cf181-2be9-47da-95f4-5650fd049e3f";

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void hamde_barit_lana(View view) {
        Intent intent=new Intent(getApplicationContext(),PlayerActivity.class);
        intent.putExtra("video",video1);
        startActivity(intent);
    }
}
