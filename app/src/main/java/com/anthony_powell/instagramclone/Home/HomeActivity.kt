package com.anthony_powell.instagramclone.Home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.anthony_powell.instagramclone.R
import com.anthony_powell.instagramclone.Utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.layout_bottom_navigation_view.*

class HomeActivity : AppCompatActivity() {

    private val TAG = "HomeActivity"
    private val ACTIVITY_NUM = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.d(TAG, "onCreate: starting....")

        initBottomNav()

    }

    private fun initBottomNav(){
        Log.d(TAG, "initBottomNav: setting up bottom navigation...")

        BottomNavigationViewHelper.noAnimationNoShiftNoItemShiftInit(bottom_nav_view_bar)
        BottomNavigationViewHelper.enableNavigation(this, bottom_nav_view_bar)
        BottomNavigationViewHelper.setActive(bottom_nav_view_bar, ACTIVITY_NUM)
    }


}
