package com.northsoltech.sign.ui.navigation

sealed class SignDestinations(val route: String) {
    object Login : SignDestinations(route = "login_screen")
    object UserType : SignDestinations(route = "usertype_screen")
    object Signup : SignDestinations(route = "signup_screen")
}
