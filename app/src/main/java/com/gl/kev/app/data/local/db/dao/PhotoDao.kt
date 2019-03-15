package com.gl.kev.app.data.local.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.gl.kev.model.Photo


@Dao
interface PhotoDao {

    @Query("SELECT * FROM photo")
    fun getAll(): LiveData<List<Photo>>

    @Query("SELECT * FROM photo WHERE id = :id")
    fun getPhotoById(id: Int?): LiveData<Photo>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(dataList: List<Photo>)

    @Update
    fun update(dataList: List<Photo>)

    @Query("DELETE FROM photo")
    fun deleteAll()

}