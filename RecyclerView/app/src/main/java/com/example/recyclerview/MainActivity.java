package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    String name[];
    RecyclerView recyclerView;
    int icon[]={
            R.drawable.ic_account_box,R.drawable.ic_add_alert,R.drawable.ic_airline_seat,R.drawable.ic_airplanemode,R.drawable.ic_alarm_black_24dp,R.drawable.ic_album_black_24dp,R.drawable.ic_announcement,R.drawable.ic_archive,R.drawable.ic_assessment_black_24dp,R.drawable.ic_assignment_late,R.drawable.ic_assignment_turned,R.drawable.ic_assistant,R.drawable.ic_av_timer,R.drawable.ic_backup
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycleId);
        name=getResources().getStringArray(R.array.name);

        MyAdapter myAdapter=new MyAdapter(this,name,icon);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
