package ae.mycourse.pokemon.framework.ui.mainscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.databinding.FragmentMainScreenBinding
import ae.mycourse.pokemon.framework.ui.pokemonlist.PokemonList
import android.widget.Button
import androidx.fragment.app.commit

class MainScreen : Fragment() {

    lateinit var buttonPokedex: Button
    lateinit var buttonFavourites: Button
    var bundle = Bundle()
    private var _binding: FragmentMainScreenBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentMainScreenBinding.inflate(inflater, container, false)
        val view = binding.root

        //Buttons listeners
        binding.buttonPokedex.setOnClickListener{
            nextFragment(PokemonList())
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