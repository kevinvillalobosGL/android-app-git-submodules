package com.gl.kev.app.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gl.kev.app.data.local.db.dao.PhotoDao
import com.gl.kev.app.data.local.db.dao.TodoDao
import com.gl.kev.model.Photo
import com.gl.kev.model.Todo


@Database(entities = [Photo::class, Todo::class], version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase() {

    abstract fun photoDao(): PhotoDao

    abstract fun todoDao(): TodoDao

}