package com.hermanissimo.android.kotlinweatherapp.domain.commands

/**
 * Created by Herman on 11.07.2017.
 */

interface Command<out T> {
    fun execute(): T
}