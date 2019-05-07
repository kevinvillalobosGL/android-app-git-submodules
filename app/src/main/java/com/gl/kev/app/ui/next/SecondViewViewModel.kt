package com.gl.kev.app.ui.next

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.gl.kev.app.App
import com.gl.kev.app.navigation.SecondViewCoordinator
import com.gl.kev.app.data.DataManager
import javax.inject.Inject

class SecondViewViewModel(application: Application) : AndroidViewModel(application) {

    @Inject
    lateinit var mDataManager: DataManager

    @Inject
    lateinit var coordinator: SecondViewCoordinator

    init {
        getApplication<App>().mApplicationComponent.inject(this)
    }

    override fun onCleared() {
        super.onCleared()
    }
}