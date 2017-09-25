package com.example.vlisn.m4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button register; //= (Button)findViewById(R.id.registerMain);
    Button login; //= (Button)findViewById(R.id.loginMain);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = (Button) findViewById(R.id.registerMain);
        login = (Button) findViewById(R.id.loginMain);

        //login.setOnClickListener(this);
        //register.setOnClickListener(this);

        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });
    }
    /*public void onClick(View v){
        switch(v.getId()) {
            case R.id.registerMain:
                //register.setOnClickListener(Register.class);
                Intent intent = new Intent(this, Register.class);
                startActivity(intent);
                //startActivity(new Intent(this, Register.class));
                break;
            case R.id.loginMain:
                startActivity(new Intent(this, Login.class));
                break;
        }
    }*/
}

