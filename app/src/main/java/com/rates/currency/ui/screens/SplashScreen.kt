package com.rates.currency.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.rates.app.R
import com.rates.currency.ui.SplashViewModel
import com.rates.framework.components.MainTitleText
import com.rates.home.navigation.HOME_GRAPH_ROUTE

@Preview
@Composable
fun PreviewSplashScreen(){
//    BikeaGbTheme {
//        SplashScreen()
//    }
}

@Composable
fun SplashRoutes(
    navHostController: NavHostController,
    splashVieModel: SplashViewModel = hiltViewModel(),
){

    SplashScreen(
        splashVieModel = splashVieModel,
        navHostController = navHostController)
}

@Composable
fun SplashScreen(
       splashVieModel: SplashViewModel,
        navHostController: NavHostController,
) {
        val timeOut =  remember { splashVieModel.isTimeOut}


    if(timeOut.value){
        timeOut.value = false
        navHostController.navigate(route = HOME_GRAPH_ROUTE){
            popUpTo(navHostController.graph.findStartDestination().id){
                inclusive = true
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.background),
        contentAlignment = Alignment.Center
    ) {
       MainTitleText(title = stringResource(id = R.string.app_name))
    }
}