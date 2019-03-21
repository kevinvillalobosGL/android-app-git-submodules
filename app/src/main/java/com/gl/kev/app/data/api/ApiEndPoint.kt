package com.gl.kev.app.data.api

import com.gl.kev.app.BuildConfig

class ApiEndPoint {

    companion object {
        const val API_URL_TODOS = "${BuildConfig.BASE_ENDPOINT_URL}/todos"
        const val API_URL_PHOTOS = "${BuildConfig.BASE_ENDPOINT_URL}/photos"
    }

}