package com.gl.kev.app.data.local

import com.gl.kev.app.data.DataManager
import com.gl.kev.app.data.local.db.DbHelper
import com.gl.kev.framework.data.BaseDataManager
import javax.inject.Inject

class AppDataManager @Inject constructor(val mDbHelper: DbHelper) : DataManager, BaseDataManager() {

    override fun getDbHelper(): DbHelper {
        return mDbHelper
    }
}