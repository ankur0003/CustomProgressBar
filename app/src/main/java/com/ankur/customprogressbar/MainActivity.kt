package com.ankur.customprogressbar

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layout = findViewById<RelativeLayout>(R.id.relativeLayout)
        val v = V(this);
        layout.addView(v)

        val timer = object : CountDownTimer(6000, 1000) {
            override fun onTick(p0: Long) {
                v.setProgress((p0 / 1000).toInt())
            }

            override fun onFinish() {
                TODO("Not yet implemented")
            }

        }
        timer.start()
    }
}