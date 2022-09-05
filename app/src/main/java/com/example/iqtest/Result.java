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
    TextView prizvanie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        butres =(Button) findViewById(R.id.button6);
        resultat =(TextView) findViewById(R.id.textView7);
        iqPoints = (TextView) findViewById(R.id.textView6);
        prizvanie = (TextView) findViewById(R.id.textView11);

        View.OnClickListener result = new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                resultat.setText("Ваш уровень интеллекта:");
                if (MainActivity.kolvo <50 ){
                    prizvanie.setText("ABOBOV");

            }
                if (MainActivity.kolvo<100 & MainActivity.kolvo>50){
                    prizvanie.setText("Normis");

            };
                if (MainActivity.kolvo>101){
                    prizvanie.setText("Geniy");
                }
                iqPoints.setText(String.valueOf(MainActivity.kolvo));
    };

};
        butres.setOnClickListener(result);
};
}