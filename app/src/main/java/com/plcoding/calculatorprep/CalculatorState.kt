package com.plcoding.calculatorprep

data class CalculatorState(
    val numbers: MutableList<Float> = mutableListOf(),
    var operators: MutableList<CalculatorOperation> = mutableListOf()
) {

}
