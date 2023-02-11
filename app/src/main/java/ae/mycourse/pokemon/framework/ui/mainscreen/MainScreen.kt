package ae.mycourse.pokemon.framework.ui.mainscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.databinding.FragmentMainScreenBinding
import ae.mycourse.pokemon.framework.ui.tabsection.TabsSection
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit

class MainScreen : Fragment() {

    var bundle = Bundle()
    private var _binding: FragmentMainScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentMainScreenBinding.inflate(inflater, container, false)
        val view = binding.root
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()
        binding.buttonPokedex.setOnClickListener{
            nextFragment(TabsSection())
        }
        binding.buttonFavorourites.setOnClickListener{
            bundle.putString("fragmentData",getString(R.string.fragmentErrorFavourites))
            /*nextFragment(FragmentError())*/
        }
        return view
    }

    private fun nextFragment(fragment: Fragment){
        parentFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.fragmentContainer, fragment)
            addToBackStack("mainStackFragments")
        }
    }
}