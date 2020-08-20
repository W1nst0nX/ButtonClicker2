package com.example.buttonclicker2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

private var timesClicked = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickMe(view : View) {
        timesClicked++
        button.text = timesClicked.toString()

        if(timesClicked == 10) {
            Toast.makeText(this, "Only 10???", Toast.LENGTH_LONG).show()
        }
        else if(timesClicked == 20) {
            Toast.makeText(this, "Wow, doubled I see. But still, just 20. SAD", Toast.LENGTH_LONG).show()
        }
    }
}