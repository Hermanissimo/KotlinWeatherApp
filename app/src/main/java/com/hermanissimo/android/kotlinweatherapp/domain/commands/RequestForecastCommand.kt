package com.hermanissimo.android.kotlinweatherapp.domain.commands

import com.hermanissimo.android.kotlinweatherapp.data.ForecastRequest
import com.hermanissimo.android.kotlinweatherapp.domain.mappers.ForecastDataMapper
import com.hermanissimo.android.kotlinweatherapp.domain.model.ForecastList

/**
 * Created by Herman on 11.07.2017.
 */

class RequestForecastCommand(val cityName: String, val countryCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(cityName, countryCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}