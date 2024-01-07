package com.rates.currency.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.rates.currency.navigation.SetupNavGraph
import com.rates.framework.ui.theming.BikeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BikeTheme {
              val  navHostController = rememberNavController()
               SetupNavGraph(navController = navHostController)
            }
        }
    }
}