package com.example.iqtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthQuestion extends AppCompatActivity {
    Button fourbutraz;
    Button fourbutmud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_question);
        fourbutraz = (Button) findViewById(R.id.button9);
        fourbutmud = (Button) findViewById(R.id.button10);

        View.OnClickListener butraz = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.kolvo = MainActivity.kolvo + 10;

                Intent intent = new Intent(FourthQuestion.this,FifthQuestion.class);
                FourthQuestion.this.startActivity(intent);
            }
        };
        fourbutraz.setOnClickListener(butraz);

        View.OnClickListener butmud = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.kolvo = MainActivity.kolvo +5;

                Intent intent = new Intent(FourthQuestion.this,FifthQuestion.class);
                FourthQuestion.this.startActivity(intent);
            }
        };
        fourbutmud.setOnClickListener(butmud);
    }
}