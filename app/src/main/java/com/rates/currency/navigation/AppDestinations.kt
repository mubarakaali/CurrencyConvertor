package com.rates.currency.navigation

const val NAV_GRAPH_ROUTE = "nav_root"
const val MAIN_GRAPH_ROUTE = "main_root"

sealed class AppDestinations(val route: String) {
    object Splash : AppDestinations(route = "splash_screen")
}
