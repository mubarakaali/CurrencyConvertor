package com.northsoltech.bikeagb.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.northsoltech.home.navigation.homeNavGraph
import com.northsoltech.sign.ui.navigation.signNavGraph

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
        signNavGraph(navController = navController)
        homeNavGraph(navController = navController)
    }
}