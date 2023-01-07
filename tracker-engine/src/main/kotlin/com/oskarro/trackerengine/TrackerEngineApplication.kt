package com.oskarro.trackerengine

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TrackerEngineApplication

fun main(args: Array<String>) {
    runApplication<TrackerEngineApplication>(*args)
}
