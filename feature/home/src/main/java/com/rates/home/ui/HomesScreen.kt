package com.rates.home.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.rates.framework.components.MediumTitleText
import com.rates.framework.states.UiState

@Composable
fun HomeRoutes(
    navController: NavHostController
) {
    val homeViewModel:HomeViewModel = hiltViewModel()

    var conversionRatesData  by remember { mutableStateOf<List<RateData>>(emptyList()) }
    var showRatesBarContentsState by remember { mutableStateOf(CurrencyContents.RATES) }


    LaunchedEffect(key1 = homeViewModel.currencyConversionState, block = {
        homeViewModel.currencyConversionState.collect{uiState->
            when(uiState){
                is UiState.Loading -> {

                }
                is UiState.Success<*> -> {
                    conversionRatesData = uiState.data as List<RateData>
                }

                is UiState.Error -> {

                }
                is UiState.Idle -> {

                }

            }

        }
    })

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)) {

        TopbarContent(
            onChartsClick = {
                showRatesBarContentsState = CurrencyContents.BARCHARTS
            },
            onRatesClick = {
                showRatesBarContentsState = CurrencyContents.RATES
            }
        )

        when(showRatesBarContentsState){
            CurrencyContents.RATES ->
                RatesContent(
                onValueChange = {
                    if (it.isNotEmpty())
                homeViewModel.getCurrencyRate(it)
            },
                    conversionRatesData = conversionRatesData
            )
            CurrencyContents.BARCHARTS -> ChartsContent()
        }
    }
}

@Composable
fun TopbarContent(
    onRatesClick:()->Unit,
    onChartsClick:()->Unit,
) {

    TopAppBar(modifier = Modifier.fillMaxWidth(),
        backgroundColor = Color.Blue,
        contentColor = Color.White) {
        MediumTitleText(
            title = "RATES",
            textColor = Color.White,
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .clickable {
                    onRatesClick()
                }
        )
        Divider(
            modifier = Modifier.width(1.dp),
            thickness = 40.dp,
            color = Color.White
        )
        MediumTitleText(
            title = "CHARTS",
            textColor = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    onChartsClick()
                }
        )
    }

}
enum class CurrencyContents {
    RATES,
    BARCHARTS
}