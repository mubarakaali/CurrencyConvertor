package com.northsoltech.home.navigation

sealed class HomeDestinations(val route: String){
    object HomeScreen:HomeDestinations(route = "home_screen")
}
