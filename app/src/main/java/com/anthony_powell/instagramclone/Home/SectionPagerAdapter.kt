package com.anthony_powell.instagramclone.Home

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


/**
 * Class that stores fragments for tabs
 */
class SectionPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val TAG = "SectionPagerAdapter"

    private val mFragmentList = ArrayList<Fragment>()

    override fun getItem(position: Int): Fragment {
        return mFragmentList[position]
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    fun addFragment(fragment: Fragment){
        mFragmentList.add(fragment)
    }
}