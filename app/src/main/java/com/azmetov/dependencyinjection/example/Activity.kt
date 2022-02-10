package com.azmetov.dependencyinjection.example

class Activity {
    lateinit var computer: Computer
    lateinit var processor: Processor

    init {
        Component().inject(this)
    }
}