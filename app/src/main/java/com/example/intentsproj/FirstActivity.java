package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    private Button btnOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnOK = findViewById(R.id.btnOK);
    }

    @Override
    protected void onResume() {
        super.onResume();

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( FirstActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
    }
    Context context = getApplicationContext();
    CharSequence message = "Sending message";
    //Display string
    int duration = Toast.LENGTH_SHORT;
    Toast toast = Toast.makeText(context, message, duration);
toast.show;
}
public class FirstActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //edit text
        final TextView enum1 = findViewById(R.id.viewNumber1);
        final TextView enum2 = findViewById(R.id.number2);

        Button btn = findViewById(R.id.btn_ok);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num1 = enum1.getText().toString();
                String num2 = enum2.getText().toString();


                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("Number_1", num1);
                intent.putExtra("Number_2", num2);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();

        Context context = getApplicationContext();
        CharSequence message = "Sending message";

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();

        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0,0);
    }
}
