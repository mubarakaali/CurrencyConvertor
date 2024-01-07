package com.rates.currency.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.rates.home.navigation.homeNavGraph

@Composable
fun SetupNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = MAIN_GRAPH_ROUTE,
        route = NAV_GRAPH_ROUTE
    ) {
        mainNavGraph(navController = navController)
        homeNavGraph(navController = navController)
    }
}