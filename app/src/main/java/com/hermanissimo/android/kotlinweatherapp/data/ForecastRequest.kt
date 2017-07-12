package com.hermanissimo.android.kotlinweatherapp.data

import com.google.gson.Gson
import java.net.URL

/**
 * Created by Herman on 11.07.2017.
 */


class ForecastRequest(val cityName: String, val countryCode: String) {

    companion object {
        private val APP_ID = "eaf2e7faa04a80390518256c701a6b4d"
        private val URL = "http://api.openweathermap.org/data/2.5/forecast/daily?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "$URL&APPID=$APP_ID&q="
    }

    fun execute(): ForecastResult {
        val forecastJsonStr = URL(COMPLETE_URL + cityName + "," + countryCode).readText()
        return Gson().fromJson(forecastJsonStr, ForecastResult::class.java)
    }
}
