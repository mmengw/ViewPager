package com.task1.fragment

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //this maybe need to change to false
    var isFragmentOneLoaded = false
    var isFragmentTwoLoaded = false
    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val NBChange = findViewById<TextView>(R.id.NBNum)
        ShowFragmentTwo()
        NBChange.setOnClickListener({
            if (isFragmentTwoLoaded)
                ShowFragmentOne()
                NBNum.setTextColor(Color.parseColor("#FF0000"))
                PSNum.setTextColor(Color.parseColor("#40FF0000"))
        })

        val PSChange = findViewById<TextView>(R.id.PSNum)
        ShowFragmentOne()
        PSChange.setOnClickListener({
            if (isFragmentOneLoaded)
               ShowFragmentTwo()
               PSNum.setTextColor(Color.parseColor("#FF0000"))
               NBNum.setTextColor(Color.parseColor("#40FF0000"))
       })
    }

    fun ShowFragmentOne() {
        val transaction = manager.beginTransaction()
        val fragment = FragmentOne()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentOneLoaded = true
    }

    fun ShowFragmentTwo() {
        val transaction = manager.beginTransaction()
        val fragment = FragmentTwo()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentTwoLoaded = true
    }

}
