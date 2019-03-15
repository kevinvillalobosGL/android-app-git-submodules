package com.gl.kev.app.data.local.db

import com.gl.kev.app.data.local.db.dao.PhotoDao
import com.gl.kev.app.data.local.db.dao.TodoDao

interface DbHelper {

    fun getPhotoDao(): PhotoDao

    fun getTodoDao(): TodoDao
}