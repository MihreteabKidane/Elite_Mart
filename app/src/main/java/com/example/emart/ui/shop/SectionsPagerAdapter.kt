package com.example.emart.ui.shop

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.emart.R
import com.example.emart.ui.categories.BeautyFragment
import com.example.emart.ui.categories.ClothingsFragment
import com.example.emart.ui.categories.ElectronicsFragment
import com.example.emart.ui.categories.FoodFragment

class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> ElectronicsFragment.newInstance()
            1 -> ClothingsFragment.newInstance()
            2 -> BeautyFragment.newInstance()
            3 -> FoodFragment.newInstance()
            else -> ElectronicsFragment.newInstance()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "Electronics"
            1 -> "Clothings"
            2 -> "Beauty"
            3 -> "Food"
            else -> "Electronics"
        }
    }

    override fun getCount(): Int {
        return 4
    }
}
