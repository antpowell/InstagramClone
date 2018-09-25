package com.anthony_powell.instagramclone.Home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.util.Log
import com.anthony_powell.instagramclone.R
import com.anthony_powell.instagramclone.Utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.layout_bottom_navigation_view.*
import kotlinx.android.synthetic.main.layout_center_viewpager.*
import kotlinx.android.synthetic.main.layout_top_tabs.*

class HomeActivity : AppCompatActivity() {

    private val TAG = "HomeActivity"
    private val ACTIVITY_NUM = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.d(TAG, "onCreate: starting....")

        initBottomNav()
        setupViewPager()

    }

    private fun setupViewPager(){
        val adapter = SectionPagerAdapter(supportFragmentManager)
        adapter.addFragment(CameraFragment())
        adapter.addFragment(HomeFragment())
        adapter.addFragment(MessageFragment())

        val viewPager: ViewPager = container
        viewPager.adapter = adapter

        val tabLayout:TabLayout = tabs
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.getTabAt(0)!!.setIcon(R.drawable.ic_camera)
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_home)
        tabLayout.getTabAt(2)!!.setIcon(R.drawable.ic_message)
    }


    /**
     * Setup bottom navigation
     */
    private fun initBottomNav(){
        Log.d(TAG, "initBottomNav: setting up bottom navigation...")

        BottomNavigationViewHelper.noAnimationNoShiftNoItemShiftInit(bottom_nav_view_bar)
        BottomNavigationViewHelper.enableNavigation(this, bottom_nav_view_bar)
        BottomNavigationViewHelper.setActive(bottom_nav_view_bar, ACTIVITY_NUM)
    }


}
