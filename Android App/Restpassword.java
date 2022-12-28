package com.example.eventmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Restpassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restpassword);
        EditText et = (EditText) findViewById(R.id.editText2);
        EditText t = (EditText) findViewById(R.id.editText3);
        Button btn= (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(et.getText().toString())){
                    et.setError("Password is compulsory");
                    return;
                }
                if(TextUtils.isEmpty(t.getText().toString())){
                    t.setError("Password is compulsory");
                    return;
                }
                startActivity(new Intent(Restpassword.this,Login.class));
            }
        });
    }
}