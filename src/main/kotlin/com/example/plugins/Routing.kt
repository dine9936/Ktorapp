package com.example.plugins

import com.example.routes.customerRoutes
import com.example.routes.listOrdersRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        customerRoutes()
        listOrdersRoute()
    }

}
