package com.example.vlisn.m4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by vlisn on 9/24/2017.
 */

public class Register extends AppCompatActivity {
    private static final String TAG = "RegisterActivity";
    //ProgressDialog progressDialog;
    Button bRegister;
    EditText etName,etUsername,etPassword;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etName = (EditText) findViewById(R.id.name);
        etUsername = (EditText) findViewById(R.id.newUsername);
        etPassword = (EditText) findViewById(R.id.newPassword);
        bRegister= (Button) findViewById(R.id.buttonCreate);

    }
    public void displayWelcome(View view) {
        Intent intent = new Intent(Register.this, Welcome.class);
        startActivity(intent);
    }
    public void displayMain(View view) {
        Intent intent = new Intent(Register.this, MainActivity.class);
        startActivity(intent);
    }
}
