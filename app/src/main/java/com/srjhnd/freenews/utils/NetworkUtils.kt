package com.srjhnd.freenews.utils

import com.srjhnd.freenews.BuildConfig

object NetworkUtils {
    val API_KEY = BuildConfig.API_KEY
    lateinit var country: String

    val ERROR = "ERROR"
    val SUCCESS = "SUCCESS"
}