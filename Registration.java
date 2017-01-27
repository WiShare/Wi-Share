package com.example.cheness.loading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class Registration extends AppCompatActivity implements OnClickListener{

    EditText etFName;
    EditText etCandS;
    EditText etNickname;

    Button GoToNewActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        etFName = (EditText) findViewById(R.id.etFName);
        etCandS = (EditText) findViewById(R.id.etCandS);
        etNickname = (EditText) findViewById(R.id.etNickname);
        GoToNewActivity = (Button) findViewById(R.id.button);
        GoToNewActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        String fullname, nickname,course;
        fullname=etFName.getText().toString();
        course = etCandS.getText().toString();
        nickname = etNickname.getText().toString();

        if(fullname.equals(""))
        {
            etFName.setError("Enter your full name");
        }
        else if(nickname.equals(""))
        {
            etNickname.setError("Enter your nickname");
        }
        else if(course.equals(""))
        {
            etCandS.setError("Enter your course/section");
        }
        else
        {
            Intent intent = new Intent(this, TextOrFile.class);
            intent.putExtra("fname", etFName.getText().toString());
            intent.putExtra("nickname", etNickname.getText().toString());
            intent.putExtra("c/s", etCandS.getText().toString());
            startActivity(intent);

            etFName.setText("");
            etNickname.setText("");
            etCandS.setText("");
        }
    }
}



