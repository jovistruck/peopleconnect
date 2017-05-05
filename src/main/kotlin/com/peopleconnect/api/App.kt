package com.peopleconnect.api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


/**
 * Created by jovianodias on 05/05/2017.
 */

@SpringBootApplication
open class App {

}

fun main(args: Array<String>) {
    println("Starting Spring Application")
    SpringApplication.run(App::class.java, *args)
}

