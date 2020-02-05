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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frag1 = FragmentOne()
        val frag2 = FragmentTwo()
        val pagerAdapter = object : FragmentPagerAdapter(supportFragmentManager, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
            override fun getCount(): Int {
                return 2
            }

            override fun getItem(position: Int): Fragment {
                if(position == 0){
                    return frag1
                }
                else{
                    return frag2
                }
            }
        }

        viewPager.adapter = pagerAdapter
        viewPager.offscreenPageLimit = 2
    }

}
