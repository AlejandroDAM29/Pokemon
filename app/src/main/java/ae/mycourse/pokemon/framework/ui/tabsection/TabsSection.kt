package ae.mycourse.pokemon.framework.ui.tabsection

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.databinding.FragmentPokemonListBinding
import ae.mycourse.pokemon.databinding.FragmentTabsSectionBinding
import ae.mycourse.pokemon.framework.ui.pokemondetails.PokemonDetails
import ae.mycourse.pokemon.framework.ui.pokemonlist.PokemonList
import androidx.core.content.ContextCompat
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class TabsSection : Fragment() {

    private var _binding: FragmentTabsSectionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentTabsSectionBinding.inflate(inflater, container, false)
        val view = binding.root

        val viewPager: ViewPager2 = binding.viewPager
        val tabLayout: TabLayout = binding.tabSelector

        val tabAdapter: TabAdapter = TabAdapter(requireActivity())
        tabAdapter.addFragment(PokemonList(),getString(R.string.Tab1),ContextCompat.getDrawable(requireContext(),R.drawable.icon_tab_list)!!)//Cambiar la lista de los nombres por variables de String definidas para idiomas
        tabAdapter.addFragment(PokemonDetails(), "Details",ContextCompat.getDrawable(requireContext(),R.drawable.loupe)!!)
        viewPager.adapter = tabAdapter
        viewPager.currentItem = 0
        TabLayoutMediator(binding.tabSelector, binding.viewPager) { tab, position ->
            tab.text = tabAdapter.getTabTitle(position)
            tab.icon = tabAdapter.getTabIcon(position)
        }.attach()

        return view
    }


}