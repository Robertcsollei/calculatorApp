package com.plcoding.calculatorprep.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.plcoding.calculatorprep.CalculatorOperation

@Composable
fun CalculatorDisplay(
    numbers: MutableList<Float>,
    operators: MutableList<CalculatorOperation>
) {

    Text(
        text = numbers
            .zip(operators) { number, operator -> "$number $operator" }
            .joinToString(" "),
        textAlign = TextAlign.End,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 32.dp),
        fontWeight = FontWeight.Light,
        color = Color.White,
        maxLines = 2
    )
}