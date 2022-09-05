package com.example.iqtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button butstart;
    public static int kolvo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butstart =(Button) findViewById(R.id.button);

        View.OnClickListener start = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FirstQustion.class);
                intent.putExtra("Kolvo",kolvo);
                MainActivity.this.startActivity(intent);

            }
        };
        butstart.setOnClickListener(start);
    }
}