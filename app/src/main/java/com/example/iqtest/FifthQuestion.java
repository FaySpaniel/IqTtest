package com.example.iqtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FifthQuestion extends AppCompatActivity {
    Button butbogest;
    Button butboganet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_question);
        butbogest = (Button) findViewById(R.id.button11);
        butboganet = (Button) findViewById(R.id.button12);

        View.OnClickListener bogest = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.kolvo = MainActivity.kolvo -20;

                Intent intent = new Intent(FifthQuestion.this,Result.class);
                FifthQuestion.this.startActivity(intent);
            }
        };
        butbogest.setOnClickListener(bogest);

        View.OnClickListener boganet = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.kolvo = MainActivity.kolvo +20;

                Intent intent = new Intent(FifthQuestion.this,Result.class);
                FifthQuestion.this.startActivity(intent);
            }
        };
        butboganet.setOnClickListener(boganet);
    }
}