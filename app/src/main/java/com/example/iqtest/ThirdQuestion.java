package com.example.iqtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdQuestion extends AppCompatActivity {

    Button buttqchiken;
    Button buttqegg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);
        buttqchiken = (Button) findViewById(R.id.button7);
        buttqegg = (Button) findViewById(R.id.button8);

        View.OnClickListener tqchiken = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.kolvo = MainActivity.kolvo +1;
                Intent intent = new Intent(ThirdQuestion.this,FourthQuestion.class);
                ThirdQuestion.this.startActivity(intent);
            }
        };
        buttqchiken.setOnClickListener(tqchiken);

        View.OnClickListener tqegg = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.kolvo = MainActivity.kolvo +2;
                Intent intent = new Intent(ThirdQuestion.this,FourthQuestion.class);
                ThirdQuestion.this.startActivity(intent);
            }
        };
        buttqegg.setOnClickListener(tqegg);
    }
}