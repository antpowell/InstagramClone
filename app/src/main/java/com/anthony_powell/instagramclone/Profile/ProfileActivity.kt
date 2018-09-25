package com.anthony_powell.instagramclone.Profile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.Menu
import com.anthony_powell.instagramclone.R
import com.anthony_powell.instagramclone.Utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.layout_bottom_navigation_view.*
import kotlinx.android.synthetic.main.profile_topbar_snippet.*

class ProfileActivity : AppCompatActivity() {

    private val TAG = "ProfileActivity"
    private val ACTIVITY_NUM = 4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        Log.d(TAG, "onCreate: starting....")

        initBottomNav()
        toolbarSetup()

    }

    private fun toolbarSetup(){
        val toolbar: Toolbar = profileToolBar
        setSupportActionBar(toolbar)

        toolbar.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.profileMenu -> Log.d(TAG, "toolbarSetup: nvaigating to profile settings")
                else ->  false
            }
            true
        }
    }

    private fun initBottomNav(){
        Log.d(TAG, "initBottomNav: setting up bottom navigation...")

        BottomNavigationViewHelper.noAnimationNoShiftNoItemShiftInit(bottom_nav_view_bar)
        BottomNavigationViewHelper.enableNavigation(this, bottom_nav_view_bar)
        BottomNavigationViewHelper.setActive(bottom_nav_view_bar, ACTIVITY_NUM)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_profile, menu)
        return true
    }

}
