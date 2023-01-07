package com.oskarro.trackerapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TrackerApiApplication

fun main(args: Array<String>) {
	runApplication<TrackerApiApplication>(*args)
}
