package com.northsoltech.bikeagb.navigation

const val ROOT_GRAPH_ROUTE = "root"
const val MAIN_GRAPH_ROUTE = "main_root"

sealed class AppDestinations(val route: String) {
    object Splash : AppDestinations(route = "home_screen")
}
