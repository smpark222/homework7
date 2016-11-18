package com.example.a403.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Et1;
    EditText Et2;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    TextView TextResult;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Et1 = (EditText) findViewById(R.id.editText);
        Et2 = (EditText) findViewById(R.id.editText2);
        b1 = (Button) findViewById(R.id.button9);
        b2 = (Button) findViewById(R.id.button10);
        b3 = (Button) findViewById(R.id.button);
        b4 = (Button) findViewById(R.id.button2);
        TextResult = (TextView) findViewById(R.id.textView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Integer.parseInt(Et1.getText().toString()) + Integer.parseInt(Et2.getText().toString());
                TextResult.setText("계산결과 : " + result);
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                result = Integer.parseInt(Et1.getText().toString()) - Integer.parseInt(Et2.getText().toString());
                TextResult.setText("계산결과 : " + result);
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                result = Integer.parseInt(Et1.getText().toString()) * Integer.parseInt(Et2.getText().toString());
                TextResult.setText("계산결과 : " + result);
            }
        });
    }
}