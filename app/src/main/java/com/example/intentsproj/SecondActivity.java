package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public class SecondActivity extends AppCompatActivity {

        TextView text1;
        TextView text2;
        String number1;
        String number2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);

            Intent intent =getIntent();
            number1 = intent.getStringExtra("Number_1");
            number2 = intent.getStringExtra("Number_2");

            text1 = findViewById(R.id.viewNumber1);
            text2 = findViewById(R.id.viewNumber2);
        }

        @Override
        protected void onResume() {
            super.onResume();
            text1.setText(number1);
            text2.setText(number2);
        }
    }

}