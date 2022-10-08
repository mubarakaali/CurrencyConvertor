package com.northsoltech.bikeagb.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.northsoltech.bikeagb.ui.screens.SplashRoutes

//object MainDestination:AppNavigationDestination {
//    override val route: String
//        get() = "splash_route"
//    override val destination: String
//        get() = "splash_destination"
//}

fun NavGraphBuilder.mainNavGraph(
    navController: NavHostController
){
  navigation(
      startDestination = AppDestinations.Splash.route,
      route = HOME_GRAPH_ROUTE
  ){
      composable(
          route = AppDestinations.Splash.route
      ){
          SplashRoutes(navHostController = navController)
      }
  }
}