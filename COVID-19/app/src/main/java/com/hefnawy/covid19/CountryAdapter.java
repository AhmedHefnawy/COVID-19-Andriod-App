package com.hefnawy.covid19;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hefnawy.covid19.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.MyViewHolder> {
    private List<Country> countries;


    public CountryAdapter(List<Country> countries) {
        this.countries = countries;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View  view = LayoutInflater.from(parent.getContext()).inflate(R.layout.statistics_raw,null,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textCountry.setText(countries.get(position).getCountry());
        holder.textDate.setText(countries.get(position).getDate().split("T")[0]);

        holder.textNewConfirmed.setText(String.valueOf(countries.get(position).getNewConfirmed()));
        holder.textNewDeaths.setText(String.valueOf(countries.get(position).getNewDeaths()));
        holder.textNewRecovered.setText(String.valueOf(countries.get(position).getNewRecovered()));



    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textCountry,textDate,textNewConfirmed,textNewDeaths,textNewRecovered;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textCountry=itemView.findViewById(R.id.statistics_raw_tv_country);
            textDate=itemView.findViewById(R.id.statistics_raw_tv_date);
            textNewConfirmed=itemView.findViewById(R.id.statistics_raw_tv_NewConfirmed);
            textNewDeaths=itemView.findViewById(R.id.statistics_raw_tv_NewDeaths);
            textNewRecovered=itemView.findViewById(R.id.statistics_raw_tv_NewRecovered);

        }
    }
}
