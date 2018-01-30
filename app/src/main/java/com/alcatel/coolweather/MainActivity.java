package com.alcatel.coolweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs.getString("weather", null) != null) {

            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);

            finish();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Msg", "OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MSG", "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MSG", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MSG", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MSG", "onDestroy");
    }


}
