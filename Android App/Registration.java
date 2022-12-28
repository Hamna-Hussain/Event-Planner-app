package com.example.eventmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        EditText et = (EditText) findViewById(R.id.editText);
        EditText et1 = (EditText) findViewById(R.id.editText1);
        EditText et2 = (EditText) findViewById(R.id.editText2);
        EditText et3 = (EditText) findViewById(R.id.editText3);

        Button btn= (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(et.getText().toString())){
                    et.setError("Username is compulsory");
                    return;
                }
                if(TextUtils.isEmpty(et1.getText().toString())){
                    et1.setError("Email is compulsory");
                    return;
                }
                if(TextUtils.isEmpty(et2.getText().toString())){
                    et2.setError("Password is compulsory");
                    return;
                }
                if(TextUtils.isEmpty(et3.getText().toString())){
                    et3.setError("Confirm Password is compulsory");
                    return;
                }

                startActivity(new Intent(Registration.this,Login.class));
            }
        });
        TextView tv= (TextView) findViewById(R.id.alreadyHaveAccount);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Registration.this,Login.class));
            }
        });
    }
}