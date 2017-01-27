package com.example.cheness.loading;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TextOrFile extends AppCompatActivity {

    TextView fullname, nickname, course;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textorfile);

        fullname = (TextView) findViewById(R.id.user_profile_name);
        nickname = (TextView) findViewById(R.id.user_nickname);
        course = (TextView) findViewById(R.id.user_profile_short_bio);

        Intent intent = getIntent();

        String fName = intent.getStringExtra("fname");
        String nName = intent.getStringExtra("nickname");
        String CrsAndSec = intent.getStringExtra("c/s");

        fullname.setText(fName);
        nickname.setText(nName);
        course.setText(CrsAndSec);

    }

}