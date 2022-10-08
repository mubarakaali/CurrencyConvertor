package com.northsoltech.bikeagb.navigation

const val ROOT_GRAPH_ROUTE = "root"
const val HOME_GRAPH_ROUTE = "home"

sealed class AppDestinations(val route: String) {
    object Splash : AppDestinations(route = "home_screen")
}
