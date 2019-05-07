package com.gl.kev.app.utils.rx

import com.gl.kev.framework.utils.rx.SchedulerProvider
import io.reactivex.Scheduler
import io.reactivex.schedulers.TestScheduler

class TestScheduleProvider(private val mTestScheduler: TestScheduler) : SchedulerProvider {

    override fun ui(): Scheduler {
        return mTestScheduler
    }

    override fun computation(): Scheduler {
        return mTestScheduler
    }

    override fun io(): Scheduler {
        return mTestScheduler
    }

}