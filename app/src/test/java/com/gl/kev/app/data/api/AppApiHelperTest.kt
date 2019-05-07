package com.gl.kev.app.data.api

import com.gl.kev.app.di.component.DaggerTestApplicationComponent
import com.gl.kev.framework.utils.rx.SchedulerProvider
import com.gl.kev.model.io.PhotoResponse
import io.reactivex.Scheduler
import io.reactivex.subscribers.TestSubscriber
import org.junit.Before
import org.junit.Test
import javax.inject.Inject


class AppApiHelperTest {

    //Note: Dagger is not recommended for Unit Testing, this is only for practicing

    @Inject
    lateinit var apiHelper: ApiHelper

    @Inject
    lateinit var schedulerProvider: SchedulerProvider

    @Before
    fun init() {
        //Note that all instances injected in this class could easily be created here..
        /*
            If DaggerTestApplicationComponent is not generated run:
                ./gradlew test
                ./gradlew assembleAndroidTest
         */
        val component = DaggerTestApplicationComponent.builder().build()
        component.inject(this)

    }

    @Test
    fun doGetPhotos() {
        val result: PhotoResponse = PhotoResponse()

        val testSubscriber = TestSubscriber<PhotoResponse>()


        val test = apiHelper.doGetPhotos()
            .subscribe { result.addAll(it) }

        test.dispose()
    }


    @Test
    fun doGetTodos() {
        val test = apiHelper.doGetTodos()
            .subscribeOn(schedulerProvider.io())
            .observeOn(schedulerProvider.ui())
            .test()

        test.assertNotTerminated()
            .assertNoErrors()
            .assertValueCount(0)

        test.dispose()

    }
}

