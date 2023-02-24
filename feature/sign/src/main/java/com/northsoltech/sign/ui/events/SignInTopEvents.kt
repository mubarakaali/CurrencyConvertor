package com.northsoltech.sign.ui.events


sealed class SignInTopEvents {
    object SignInEvents:SignInTopEvents()
    object RegistrationEvents:SignInTopEvents()
    object UserAuthenticated:SignInTopEvents()
    data class UserAuthenticationFailed(var errorMessage: String):SignInTopEvents()
}