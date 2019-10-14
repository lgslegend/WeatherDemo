package com.xiongms.weather

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import com.xiongms.weather.view.WeatherEnum

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 雷雨天气
        weather_view.setWeatherEnum(WeatherEnum.LIGHT_RAIN)

        // 高温天气
//        weather_view.setWeatherEnum(WeatherEnum.HIGH_TEMP)
    }
}
