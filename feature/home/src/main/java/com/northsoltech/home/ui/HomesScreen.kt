package com.northsoltech.home.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.northsoltech.framework.components.MediumTitleText
import com.northsoltech.framework.ui.theming.Dimension
import com.northsoltech.framework.utils.enums.UserType
import com.framework.R

@Composable
fun HomeRoutes(
    navController: NavHostController
) {

    HomeScreen(onButtonClicked = {
//        navHostController.navigate(HomeDestinations.Signup.route)
    })
}

@Composable
fun HomeScreen(
    onButtonClicked: (userType: UserType) ->  Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(Dimension.pagePadding.times(5)))
        Image(
            modifier = Modifier
                .height(Dimension.xlIcon)
                .width(Dimension.xlIcon),
            painter = painterResource(id = R.drawable.ic_cap) ,
            contentDescription = "app_icon")
        Spacer(modifier = Modifier.height(Dimension.pagePadding))
        MediumTitleText(title = "Home Screen")
    }
}