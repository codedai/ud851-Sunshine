package com.example.android.sunshine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mTextView = (TextView) findViewById(R.id.tv_detail_message);

        Intent intent = getIntent();
        String weather = intent.getStringExtra("weather_message");
        if (weather != null && !weather.equals(""))
            mTextView.setText(weather);
    }
}
