package com.anthony_powell.instagramclone.Utils

import android.content.Context
import android.content.Intent
import android.util.Log
import com.anthony_powell.instagramclone.*
import com.anthony_powell.instagramclone.Add.AddActivity
import com.anthony_powell.instagramclone.Home.HomeActivity
import com.anthony_powell.instagramclone.Notifications.NotificationActivity
import com.anthony_powell.instagramclone.Profile.ProfileActivity
import com.anthony_powell.instagramclone.Search.SearchActivity
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx

class BottomNavigationViewHelper{

    companion object {
        private val TAG = "BottomNavigationViewHel"



        fun noAnimationNoShiftNoItemShiftInit(bottomNavigationView: BottomNavigationViewEx){
            Log.d(TAG, "bottomNavInit: setting up...")

            bottomNavigationView.enableAnimation(false)
            bottomNavigationView.enableItemShiftingMode(false)
            bottomNavigationView.enableShiftingMode(false)
            bottomNavigationView.setTextVisibility(true)
        }
        fun noAnimationNoShiftNoItemShiftNoTextInit(bottomNavigationView: BottomNavigationViewEx){
            Log.d(TAG, "bottomNavInit: setting up...")

            bottomNavigationView.enableAnimation(false)
            bottomNavigationView.enableItemShiftingMode(false)
            bottomNavigationView.enableShiftingMode(false)
            bottomNavigationView.setTextVisibility(false)
        }

        fun enableNavigation(context: Context, bottomNavigationView: BottomNavigationViewEx): Boolean {
            bottomNavigationView.setOnNavigationItemSelectedListener { selection ->
                when(selection.itemId){
                    R.id.home -> {
                        context.startActivity(Intent(context, HomeActivity::class.java))
                    }
                    R.id.search -> {
                        context.startActivity(Intent(context, SearchActivity::class.java))
                    }
                    R.id.profile -> {
                        context.startActivity(Intent(context, ProfileActivity::class.java))
                    }
                    R.id.add -> {
                        context.startActivity(Intent(context, AddActivity::class.java))
                    }
                    R.id.alert -> {
                        context.startActivity(Intent(context, NotificationActivity::class.java))
                    }
                    else -> {}
                }
                 true
            }

            return false
        }

        fun setActive(bottomNavigationView: BottomNavigationViewEx,navItem: Int){
            bottomNavigationView.menu.getItem(navItem).isChecked = true
        }

    }

}