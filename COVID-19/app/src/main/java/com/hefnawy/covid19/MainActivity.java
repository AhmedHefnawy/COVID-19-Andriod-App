package com.hefnawy.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.hefnawy.covid19.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textStatics = findViewById(R.id.MainActivity_Statistics);

        TextView textQuestion = findViewById(R.id.MainActivity_Question);



        textStatics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  Stats = new Intent(getApplicationContext(), Statistics.class);
                startActivity(Stats);
                finish();
            }
        });



        textQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  info = new Intent(getApplicationContext(), Questions.class);
                startActivity(info);
                finish();
            }
        });

    }
}
