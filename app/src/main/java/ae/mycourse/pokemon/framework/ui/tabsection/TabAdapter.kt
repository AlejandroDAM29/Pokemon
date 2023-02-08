package ae.mycourse.pokemon.framework.ui.tabsection

import android.graphics.drawable.Drawable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter(FragmentActivity: FragmentActivity) : FragmentStateAdapter(FragmentActivity) {

    var fragmentList: ArrayList<Fragment> = ArrayList()
    var fragmentTitle: ArrayList<String> = ArrayList()
    var fragmentIcon: ArrayList<Drawable> = ArrayList()

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

    fun getTabTitle(position : Int): String{
        return fragmentTitle[position]
    }

    fun getTabIcon(position : Int): Drawable{
        return fragmentIcon[position]
    }

    fun addFragment(fragment: Fragment, title: String, icon: Drawable) {
        fragmentList.add(fragment)
        fragmentTitle.add(title)
        fragmentIcon.add(icon)
    }
}