package com.northsoltech.sign.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.northsoltech.sign.ui.screens.*

const val SIGN_GRAPH_ROUTE = "sign_routes"
fun NavGraphBuilder.signNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = SignDestinations.Login.route,
        route = SIGN_GRAPH_ROUTE
    ){
        composable(route = SignDestinations.Login.route) {
            LoginRoutes(navController = navController)
        }

        composable(route = SignDestinations.UserType.route) {
            UserTypeRoutes(navHostController = navController)
        }
        composable(route = SignDestinations.Signup.route) {
            SignupRoutes(navController = navController)
        }
    }

}