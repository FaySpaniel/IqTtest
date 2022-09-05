package com.example.iqtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstQustion extends AppCompatActivity {
    Button butfqyes;
    Button butfqno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_qustion);
        butfqyes =(Button) findViewById(R.id.button2);
        butfqno = (Button) findViewById(R.id.button3);

        View.OnClickListener fqyes = new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MainActivity.kolvo = MainActivity.kolvo + 100;
                Intent intent = new Intent(FirstQustion.this, SecondQuestion.class);
                FirstQustion.this.startActivity(intent);
            }
        };
        butfqyes.setOnClickListener(fqyes);

        View.OnClickListener fqno = new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MainActivity.kolvo = MainActivity.kolvo + 50;
                Intent intent = new Intent(FirstQustion.this, SecondQuestion.class);
                FirstQustion.this.startActivity(intent);
            }
        };
        butfqno.setOnClickListener(fqno);
    }
}