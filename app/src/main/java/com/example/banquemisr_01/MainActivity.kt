package com.example.banquemisr_01

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
Log.d("MainActivity", "onCreate")
        setContentView(R.layout.activity_main)
    }


//    override fun onStart() {
//        Log.d("MainActivity", "onStart")
//        super.onStart()
//    }
//
//    override fun onRestart() {
//        Log.d("MainActivity", "onRestart")
//        super.onRestart()
//    }
//    override fun onResume() {
//        Log.d("MainActivity", "onResume")
//        super.onResume()
//    }
//
//    override fun onPause() {
//        Log.d("MainActivity", "onPause")
//        super.onPause()
//    }
//
//    override fun onStop() {
//        Log.d("MainActivity", "onStop")
//        super.onStop()
//    }
//    override fun onDestroy() {
//        Log.d("MainActivity", "onDestroy")
//        super.onDestroy()
//
//
//
//    }

}