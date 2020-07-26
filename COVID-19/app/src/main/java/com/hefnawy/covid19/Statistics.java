package com.hefnawy.covid19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.github.loadingview.LoadingView;
import com.hefnawy.covid19.R;

public class Statistics extends AppCompatActivity {
    RecyclerView Staistics_rv;
    CountryAdapter adapter;
    interface_Api interfaceApi_;
    LoadingView loadingView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        TextView home = findViewById(R.id.Statistics_Home);
        TextView question = findViewById(R.id.Statistics_Question);
        Staistics_rv = findViewById(R.id.Staistics_rv);
        loadingView = findViewById(R.id.loadingView);
        loadingView.stop();
        interfaceApi_ = Client.getClient().create(interface_Api.class);

        Call<Covid> call = interfaceApi_.getAllData();

        loadingView.start();
        call.enqueue(new Callback<Covid>() {
            @Override
            public void onResponse(Call<Covid> call, Response<Covid> response) {
                Log.i("responseBody:", "" + response.body());
                Log.i("responseBodyString:", "" + response.body().toString());
                if (response.isSuccessful()) {
                    adapter = new CountryAdapter(response.body().getCountries());
                    Staistics_rv.setAdapter(adapter);
                    Staistics_rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    loadingView.stop();
                } else {
                    Log.i("isSuccessful:", "false");
                    loadingView.stop();
                }

            }

            @Override
            public void onFailure(Call<Covid> call, Throwable t) {
                Log.i("onFailure:", t.getMessage() + "\n" + call.request().toString());
                loadingView.stop();
            }
        });


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Home);
                finish();
            }
        });


        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent(getApplicationContext(), Questions.class);
                startActivity(info);
                finish();
            }
        });


    }
}
