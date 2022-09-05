package com.example.iqtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    Button butres;
    TextView resultat;
    TextView iqPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        butres =(Button) findViewById(R.id.button6);
        resultat =(TextView) findViewById(R.id.textView7);
        iqPoints = (TextView) findViewById(R.id.textView6);

        View.OnClickListener result = new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                resultat.setText("Ваш IQ Равен:");
                iqPoints.setText(String.valueOf(MainActivity.kolvo));
            }
        };
        butres.setOnClickListener(result);
    }
}