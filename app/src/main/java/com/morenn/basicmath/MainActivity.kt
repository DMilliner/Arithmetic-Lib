package com.morenn.basicmath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.morenn.basicmathlib.*

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "MainActivity — onCreate")
        Log.i(TAG, "Simple Addition — result ${simpleAddition(p1 = 10, p2 = 6)} == 16")
        Log.i(TAG, "Simple Subtraction — result ${simpleSubtraction(p1 = 10, p2 = 6)}  == 4")
        Log.i(TAG, "Simple Multiplication  — result ${simpleMultiplication(p1 = 4, p2 = 6)}  == 24")
        Log.i(TAG, "Simple Division  — result ${simpleDivision(p1 = 70, p2 = 2)}  == 35")

        Log.i(TAG, "isOdd — result ${isOd(p1 = 71)}  == true")
        Log.i(TAG, "isEven  — result ${isEven(15)}  == false")
    }
}