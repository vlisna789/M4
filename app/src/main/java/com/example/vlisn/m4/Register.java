package com.example.vlisn.m4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by vlisn on 9/24/2017.
 */

public class Register extends AppCompatActivity implements View.OnClickListener{
    Button bRegister;
    EditText etName,etUsername,etPassword;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText) findViewById(R.id.name);
        etUsername = (EditText) findViewById(R.id.newUsername);
        etPassword = (EditText) findViewById(R.id.newPassword);
        bRegister= (Button) findViewById(R.id.buttonCreate);

        bRegister.setOnClickListener(this);

    }

    public void onClick(View v){
        switch(v.getId()) {
            case R.id.buttonCreate:
                startActivity(new Intent(this, Login.class));
                break;
        }
    }
}
