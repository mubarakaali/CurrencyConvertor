package com.northsoltech.bikeagb.navigation

const val NAV_GRAPH_ROUTE = "nav_root"
const val MAIN_GRAPH_ROUTE = "main_root"

sealed class AppDestinations(val route: String) {
    object Splash : AppDestinations(route = "home_screen")
}
