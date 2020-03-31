package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottomNavigationIc);

        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutId,new HomeActivity()).commit();
        }
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment=null;
                if(menuItem.getItemId()==R.id.homeId){
                    fragment=new HomeActivity();
                }else if(menuItem.getItemId()==R.id.trafficId){
                    fragment=new TrafficActivity();
                }else if(menuItem.getItemId()==R.id.verifiedId){
                    fragment=new VerifiedActivity();
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutId,fragment).commit();
                return false;
            }
        });

    }
}
