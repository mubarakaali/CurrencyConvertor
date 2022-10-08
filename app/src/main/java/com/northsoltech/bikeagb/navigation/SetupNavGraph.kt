package com.northsoltech.bikeagb.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.northsoltech.bikeagb.navigation.mainNavGraph
import com.northsoltech.sign.ui.navigation.signNavGraph

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController ,
        startDestination =HOME_GRAPH_ROUTE,
        route = ROOT_GRAPH_ROUTE
    ){
        mainNavGraph(
            navController = navController
        )
        signNavGraph(
            navController = navController
        )
    }
}