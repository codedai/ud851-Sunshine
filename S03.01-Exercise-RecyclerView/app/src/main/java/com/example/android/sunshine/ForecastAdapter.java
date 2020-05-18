package com.example.android.sunshine;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.content.ContentValues.TAG;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {
    private String [] mWeatherData;

    public ForecastAdapter() {}

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.forecast_list_item, viewGroup, false);
        return new ForecastAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder forecastAdapterViewHolder, int i) {
        System.out.println( "onBindViewHolder: " + i);
        forecastAdapterViewHolder.mWeatherTextView.setText(mWeatherData[i]);
    }

    @Override
    public int getItemCount() {
        if (mWeatherData == null) return 0;
        else return mWeatherData.length;
    }

    public void setWeatherData(String [] weatherData) {
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }

    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {
        final TextView mWeatherTextView;

        ForecastAdapterViewHolder(View itemView) {
            super(itemView);
            mWeatherTextView = itemView.findViewById(R.id.tv_weather_data);
        }
    }
}
