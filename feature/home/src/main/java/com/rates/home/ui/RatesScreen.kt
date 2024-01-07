package com.rates.home.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rates.framework.components.MediumTitleText
import com.rates.framework.ui.theming.LightGray
import com.rates.framework.utils.extensions.SuffixTransformation
import com.rates.framework.utils.regex.RegexMatch

@Composable
fun RatesContent(onValueChange: (String) -> Unit, conversionRatesData: List<RateData>) {

    Column(modifier = Modifier.fillMaxSize()) {
        NumberTextField(onValueChange = onValueChange)
        LazyColumn(
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 10.dp)
                .fillMaxWidth()
                .padding(all = 10.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            content = {
                items(conversionRatesData) {rate->
                    RatesItemUi(rate)
                }
            })
    }
}

@Composable
fun RatesItemUi(rateData: RateData) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(
            containerColor = LightGray
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(
            horizontal = 15.dp,
            vertical = 15.dp
        )) {
        MediumTitleText(title = rateData.rate.toString())
    }

    }
}

@Composable
fun NumberTextField(
    onValueChange: (String) -> Unit
) {
    var value by remember { mutableStateOf("1") }
    val focusRequester = remember { FocusRequester() }

    val onValueChange: (String) -> Unit = {
        value = it
        onValueChange(it)
    }

    LaunchedEffect(key1 = Unit, block = {
        focusRequester.requestFocus()
        onValueChange("1")
    })

    Card(
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 20.dp)
            .fillMaxWidth()
            .height(50.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = LightGray
        ),
        border = BorderStroke(width = 1.dp, color = Color.Gray)
    ) {
        Row(
            modifier = Modifier

                .padding(horizontal = 10.dp, vertical = 5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row {


                BasicTextField(
                    modifier = Modifier.focusRequester(focusRequester),
                    value = value,
                    onValueChange = { s ->
                        if (s.matches(RegexMatch.Number_REGEX) && s.length <= 10) {
                            onValueChange(s)
                        }
                    },
                    textStyle = TextStyle(
                        color = MaterialTheme.colorScheme.primary,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold, fontSize = 35.sp,
                        platformStyle = PlatformTextStyle(
                            includeFontPadding = false
                        ),
                        textDirection = TextDirection.Ltr
                    ),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Done,
                        keyboardType = KeyboardType.Number,
                    ),
                    decorationBox = { innerTextField ->
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ) {
//                        if (value.isEmpty()) {
//                            StandardCustomText(
//                                text = placeholder,
//                                color = loginBorderColor,
//                                fontSize = 30.ssp
//                            )
//                        }
                        }
                        innerTextField()
                    },
                    visualTransformation = SuffixTransformation(" EUR"),

                    )
            }

        }
    }

}