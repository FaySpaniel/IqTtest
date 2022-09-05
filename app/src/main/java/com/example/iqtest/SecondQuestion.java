package com.example.iqtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondQuestion extends AppCompatActivity {

    Button butsqyes;
    Button butsqno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);
        butsqyes = (Button) findViewById(R.id.button4);
        butsqno = (Button) findViewById(R.id.button5);

        View.OnClickListener sqyes = new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MainActivity.kolvo = MainActivity.kolvo -99;
                Intent intent = new Intent(SecondQuestion.this, ThirdQuestion.class);
                SecondQuestion.this.startActivity(intent);
            }
        };
        butsqyes.setOnClickListener(sqyes);

        View.OnClickListener sqno = new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MainActivity.kolvo = MainActivity.kolvo +46;
                Intent intent = new Intent(SecondQuestion.this, ThirdQuestion.class);
                SecondQuestion.this.startActivity(intent);
            }
        };
        butsqno.setOnClickListener(sqno);
    }
}