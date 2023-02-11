package ae.mycourse.pokemon.framework.ui.tabsection

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter(fragmentActivity: FragmentActivity, _context: Context) : FragmentStateAdapter(fragmentActivity) {

    var fragmentList: ArrayList<Fragment> = ArrayList()
    var fragmentTitle: ArrayList<String> = ArrayList()
    var fragmentIcon: ArrayList<Drawable> = ArrayList()
    val contextAdapter: Context = _context

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

    fun addFragment(fragment: Fragment, idTitle: Int, idIcon: Int) {
        fragmentList.add(fragment)
        fragmentTitle.add(contextAdapter.getString(idTitle))
        fragmentIcon.add(ContextCompat.getDrawable(contextAdapter, idIcon)!!)
    }
}