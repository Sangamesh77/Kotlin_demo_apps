package com.demo.sandboxapp

class Dice(maxSides: Int){

    private val maxVal: IntRange
    init {
        maxVal = 1..maxSides
    }

    fun roll():Int{
        return maxVal.random()
    }

}