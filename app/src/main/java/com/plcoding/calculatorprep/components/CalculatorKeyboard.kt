package com.plcoding.calculatorprep.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.plcoding.calculatorprep.interfaces.CalculatorAction
import com.plcoding.calculatorprep.interfaces.CalculatorOperation
import com.plcoding.calculatorprep.ui.theme.LightGray
import com.plcoding.calculatorprep.ui.theme.Orange

@Composable
fun CalculatorKeyboard(
    buttonSpacing: Dp,
    onAction: (CalculatorAction) -> Unit
) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
    ) {
        CalculatorButton(
            symbol = "AC",
            modifier = Modifier
                .background(LightGray)
                .aspectRatio(2f)
                .weight(2f),
            onClick = {
                onAction(CalculatorAction.Clear)
            }
        )

        CalculatorButton(
            symbol = "Del",
            modifier = Modifier
                .background(LightGray)
                .aspectRatio(1f)
                .weight(1f),
            onClick = {
                onAction(CalculatorAction.Delete)
            }
        )

        CalculatorButton(
            symbol = "/",
            modifier = Modifier
                .background(Orange)
                .aspectRatio(1f)
                .weight(1f),
            onClick = {
                onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
            }
        )


    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
    ) {
        CalculatorButton(
            symbol = "7",
            modifier = Modifier
                .background(Color.LightGray)
                .aspectRatio(1f)
                .weight(1f),
            onClick = {
                onAction(CalculatorAction.Number(7))
            }
        )

        CalculatorButton(
            symbol = "8",
            modifier = Modifier
                .background(Color.LightGray)
                .aspectRatio(1f)
                .weight(1f),
            onClick = {
                onAction(CalculatorAction.Number(8))
            }
        )

        CalculatorButton(
            symbol = "9",
            modifier = Modifier
                .background(Color.LightGray)
                .aspectRatio(1f)
                .weight(1f),
            onClick = {
                onAction(CalculatorAction.Number(9))
            }
        )

        CalculatorButton(
            symbol = "x",
            modifier = Modifier
                .background(Orange)
                .aspectRatio(1f)
                .weight(1f),
            onClick = {
                onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
            }
        )

    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
    ) {
        CalculatorButton(
            symbol = "4",
            modifier = Modifier
                .background(Color.LightGray)
                .aspectRatio(1f)
                .weight(1f),
            onClick = {
                onAction(CalculatorAction.Number(4))
            }
        )

        CalculatorButton(
            symbol = "5",
            modifier = Modifier
                .background(Color.LightGray)
                .aspectRatio(1f)
                .weight(1f),
            onClick = {
                onAction(CalculatorAction.Number(5))
            }
        )

        CalculatorButton(
            symbol = "6",
            modifier = Modifier
                .background(Color.LightGray)
                .aspectRatio(1f)
                .weight(1f),
            onClick = {
                onAction(CalculatorAction.Number(6))
            }
        )

        CalculatorButton(
            symbol = "-",
            modifier = Modifier
                .background(Orange)
                .aspectRatio(1f)
                .weight(1f),
            onClick = {
                onAction(CalculatorAction.Operation(CalculatorOperation.Substract))
            }
        )

    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
    ) {
        CalculatorButton(
            symbol = "1",
            modifier = Modifier
                .background(Color.LightGray)
                .aspectRatio(1f)
                .weight(1f),
            onClick = {
                onAction(CalculatorAction.Number(1))
            }
        )

        CalculatorButton(
            symbol = "2",
            modifier = Modifier
                .background(Color.LightGray)
                .aspectRatio(1f)
                .weight(1f),
            onClick = {
                onAction(CalculatorAction.Number(2))
            }
        )

        CalculatorButton(
            symbol = "3",
            modifier = Modifier
                .background(Color.LightGray)
                .aspectRatio(1f)
                .weight(1f),
            onClick = {
                onAction(CalculatorAction.Number(3))
            }
        )

        CalculatorButton(
            symbol = "+",
            modifier = Modifier
                .background(Orange)
                .aspectRatio(1f)
                .weight(1f),
            onClick = {
                onAction(CalculatorAction.Operation(CalculatorOperation.Add))
            }
        )

    }


    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
    ) {
        CalculatorButton(
            symbol = "0",
            modifier = Modifier
                .background(Color.LightGray)
                .aspectRatio(2f)
                .weight(2f),
            onClick = {
                onAction(CalculatorAction.Number(0))
            }
        )

        CalculatorButton(
            symbol = "0",
            modifier = Modifier
                .background(Color.LightGray)
                .aspectRatio(1f)
                .weight(1f),
            onClick = {
                onAction(CalculatorAction.Decimal)
            }
        )


        CalculatorButton(
            symbol = "=",
            modifier = Modifier
                .background(Orange)
                .aspectRatio(1f)
                .weight(1f),
            onClick = {
                onAction(CalculatorAction.Calculate)
            }
        )

    }
}