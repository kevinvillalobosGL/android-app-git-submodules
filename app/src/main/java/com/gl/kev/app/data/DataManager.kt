package com.gl.kev.app.data

import com.gl.kev.app.data.api.ApiHelper
import com.gl.kev.app.data.local.db.DbHelper
import com.gl.kev.model.io.PhotoResponse
import com.gl.kev.model.io.TodoResponse
import io.reactivex.functions.Consumer


interface DataManager {

    fun getDbHelper(): DbHelper

    fun getApiHelper(): ApiHelper

    fun getPhotos(response: Consumer<PhotoResponse>, failure: Consumer<Throwable>)

    fun getTodos(response: Consumer<TodoResponse>, failure: Consumer<Throwable>)
}