package com.bugfender.bugfenderkmm.shared

class Calculator {

    fun divide(dividend: Float, divisor: Float): Float {
        val result = dividend / divisor
        // Log to Bugfender
        BFLogger.log("The result of the division is $result")
        return result
    }

}