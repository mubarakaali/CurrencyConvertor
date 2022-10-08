package com.northsoltech.bikeagb.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.northsoltech.bikeagb.navigation.SetupNavGraph
import com.northsoltech.framework.ui.theming.BikeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    lateinit var navHostController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BikeTheme {
               navHostController = rememberNavController()
               SetupNavGraph(navController = navHostController)
            }
        }
    }
}