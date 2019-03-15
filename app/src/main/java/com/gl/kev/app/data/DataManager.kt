package com.gl.kev.app.data

import com.gl.kev.app.data.local.db.DbHelper

interface DataManager {

    fun getDbHelper(): DbHelper
}