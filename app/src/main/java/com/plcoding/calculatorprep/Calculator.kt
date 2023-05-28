package com.plcoding.calculatorprep

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.plcoding.calculatorprep.components.CalculatorButton
import com.plcoding.calculatorprep.components.CalculatorDisplay

@Composable
fun Calculator(
    state: CalculatorState,
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 8.dp,
) {


    Box(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .then(modifier),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            CalculatorDisplay(state.numbers, state.operators)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(symbol = "AC", modifier = Modifier.background(LightGray)) {

                }
            }
        }
    }
}