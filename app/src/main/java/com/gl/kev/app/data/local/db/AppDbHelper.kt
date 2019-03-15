package com.gl.kev.app.data.local.db

import com.gl.kev.app.data.local.db.dao.PhotoDao
import com.gl.kev.app.data.local.db.dao.TodoDao
import javax.inject.Inject

class AppDbHelper @Inject constructor(private val mAppDatabase: AppDataBase) : DbHelper {

    override fun getPhotoDao(): PhotoDao {
        return mAppDatabase.photoDao()
    }

    override fun getTodoDao(): TodoDao {
        return mAppDatabase.todoDao()
    }
}