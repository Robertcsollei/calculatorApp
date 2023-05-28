package com.plcoding.calculatorprep.interfaces

data class CalculatorState(
    val numbers: MutableList<Float> = mutableListOf(),
    var operators: MutableList<CalculatorOperation> = mutableListOf()
) {

}
