package com.phone1000.administrator.mygit_leveltopapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //git第一次使用
        TextView tvgit = (TextView) findViewById(R.id.tv_git);
        tvgit.setText("you are SB,do you know?");
    }
}
