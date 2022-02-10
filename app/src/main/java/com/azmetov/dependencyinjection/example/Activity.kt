package com.azmetov.dependencyinjection.example

import javax.inject.Inject

class Activity {

    val mouse: Mouse = DaggerNewComponent.create().getMouse()

    val monitor: Monitor = DaggerNewComponent.create().getMonitor()

    @Inject
    lateinit var keyboard: Keyboard

    init {
        DaggerNewComponent.create().inject(this)
    }

}