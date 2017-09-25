package com.example.vlisn.m4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button register = (Button)findViewById(R.id.registerMain);
    Button login = (Button)findViewById(R.id.loginMain);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = (Button) findViewById(R.id.registerMain);
        login = (Button) findViewById(R.id.loginMain);

        login.setOnClickListener(this);
        register.setOnClickListener(this);
    }
    public void onClick(View v){
        switch(v.getId()) {
            case R.id.registerMain:
                startActivity(new Intent(this, Register.class));
                break;
            case R.id.loginMain:
                startActivity(new Intent(this, Login.class));
                break;
        }
    }
}
