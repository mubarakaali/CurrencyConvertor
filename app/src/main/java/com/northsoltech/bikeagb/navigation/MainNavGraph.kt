package com.northsoltech.bikeagb.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.northsoltech.bikeagb.ui.screens.SplashRoutes

fun NavGraphBuilder.mainNavGraph(
    navController: NavHostController
){
  navigation(
      startDestination = AppDestinations.Splash.route,
      route = MAIN_GRAPH_ROUTE
  ){
      composable(
          route = AppDestinations.Splash.route
      ){
          SplashRoutes(navHostController = navController)
      }
  }
}