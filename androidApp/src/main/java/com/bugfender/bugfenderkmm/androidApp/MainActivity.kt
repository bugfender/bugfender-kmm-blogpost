package com.bugfender.bugfenderkmm.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.bugfender.bugfenderkmm.shared.BFLogger
import com.bugfender.bugfenderkmm.shared.Calculator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dividendTv: EditText = findViewById(R.id.dividendEt)
        val divisorTv: EditText = findViewById(R.id.divisorEt)
        val resultTv: TextView = findViewById(R.id.resultTv)
        val calculateButton: Button = findViewById(R.id.calculateBt)

        calculateButton.setOnClickListener {
            val dividend = dividendTv.text.toString().toFloat()
            val divisor = divisorTv.text.toString().toFloat()

            // Call to Kotlin Multiplatform
            val result = Calculator().divide(dividend = dividend, divisor = divisor)
            resultTv.text = "Result $result"

            // Log to Bugfender
            BFLogger.log("The result of the division is $result")
        }
    }
}
