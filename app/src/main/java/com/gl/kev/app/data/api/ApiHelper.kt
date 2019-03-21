package com.gl.kev.app.data.api

import com.gl.kev.model.io.PhotoResponse
import com.gl.kev.model.io.TodoResponse
import io.reactivex.Observable

interface ApiHelper {

    fun doGetPhotos(): Observable<PhotoResponse>

    fun doGetTodos(): Observable<TodoResponse>

}