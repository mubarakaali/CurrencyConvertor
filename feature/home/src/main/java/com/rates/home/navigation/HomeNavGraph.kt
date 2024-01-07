package com.rates.home.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.rates.home.ui.HomeRoutes

const val HOME_GRAPH_ROUTE = "home_routes"
fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = HomeDestinations.HomeScreen.route,
        route = HOME_GRAPH_ROUTE,
    ){
      composable(
          route = HomeDestinations.HomeScreen.route
      ){
          HomeRoutes(navController = navController)
      }
    }
}

