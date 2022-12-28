package com.example.eventmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText et = (EditText) findViewById(R.id.editText1);
        EditText et1 = (EditText) findViewById(R.id.editText2);

        Button b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(et.getText().toString())){
                    et.setError("Email is compulsory");
                    return;
                }
                if(TextUtils.isEmpty(et1.getText().toString())){
                    et1.setError("Password is compulsory");
                    return;
                }

                startActivity(new Intent(Login.this,MainActivity.class));
            }
        });

        TextView t= (TextView) findViewById(R.id.textview);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,ForgetPassword.class));
            }
        });

        TextView tv= (TextView) findViewById(R.id.textViewSignUp);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,Registration.class));
            }
        });
    }
}