package com.example.vlisn.m4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by vlisn on 9/24/2017.
 */

public class Welcome extends AppCompatActivity implements View.OnClickListener {
    Button logoutB;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        logoutB = (Button) findViewById(R.id.logout);

        logoutB.setOnClickListener(this);

    }

    public void onClick(View v){
        switch(v.getId()) {
            case R.id.logout:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }
}