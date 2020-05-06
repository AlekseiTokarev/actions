package com.hylamobile

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ActionApp


fun main(args: Array<String>) {
    runApplication<ActionApp>(*args)
}
