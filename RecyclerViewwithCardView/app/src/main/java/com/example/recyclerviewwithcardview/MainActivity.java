package com.example.recyclerviewwithcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String>name=new ArrayList<String>(Arrays.asList("Account","Add Alert","Airline seat","Airplane mode","Alarm","Album","Announcement","Archive","Assessment","Assignment","Assistant","AV timer","Backup"));
    ArrayList<Integer>icon=new ArrayList<>(Arrays.asList(R.drawable.ic_account_box,R.drawable.ic_add_alert,R.drawable.ic_airline_seat,R.drawable.ic_airplanemode,R.drawable.ic_alarm_black_24dp,R.drawable.ic_album_black_24dp,R.drawable.ic_announcement,R.drawable.ic_archive,R.drawable.ic_assessment_black_24dp,R.drawable.ic_assignment_late,R.drawable.ic_assignment_turned,R.drawable.ic_assistant,R.drawable.ic_av_timer,R.drawable.ic_backup));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycleViewId);

        CustomAdapter myAdapter=new CustomAdapter(this,name,icon);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}
