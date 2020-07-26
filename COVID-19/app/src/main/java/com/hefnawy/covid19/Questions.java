package com.hefnawy.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.hefnawy.covid19.R;

public class Questions extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        TextView textHome = findViewById(R.id.Question_Home);
        TextView textStatics = findViewById(R.id.Question_Statistics);


        textHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Home = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(Home);
                finish();
            }
        });
        textStatics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  Stats = new Intent(getApplicationContext(), Statistics.class);
                startActivity(Stats);
                finish();
            }
        });




    }
}
