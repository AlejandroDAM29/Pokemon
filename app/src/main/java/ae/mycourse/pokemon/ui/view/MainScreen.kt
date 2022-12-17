package ae.mycourse.pokemon.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.data.customdialogs.DialogMainScreen
import ae.mycourse.pokemon.data.providerClasses.PokemonProvider
import ae.mycourse.pokemon.databinding.FragmentPokemonListBinding
import ae.mycourse.pokemon.domain.GetPokemonListUseCase
import ae.mycourse.pokemon.ui.viewmodel.MainScreenViewModel
import android.widget.Button
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer

class MainScreen : Fragment() {

    lateinit var buttonPokedex: Button
    lateinit var buttonFavourites: Button
    var bundle = Bundle()
    private val pokemonList : MainScreenViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view  = inflater.inflate(R.layout.fragment_main_screen, container, false)
        buttonPokedex = view.findViewById(R.id.buttonPokedex)
        buttonFavourites = view.findViewById(R.id.buttonFavorourites)

        //Buttons listeners
        buttonPokedex.setOnClickListener{
            pokemonList.getPokemonList(requireContext())
            nextFragment(PokemonList())
        }
        buttonFavourites.setOnClickListener{
            bundle.putString("fragmentData",getString(R.string.fragmentErrorFavourites))
            /*nextFragment(FragmentError())*/
        }
        return view
    }



    private fun nextFragment(fragment: Fragment){
        /*fragmentManager?.beginTransaction()?.replace(R.id.fragmentContainer,fragment)?.commit()*/
        parentFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.fragmentContainer, fragment)
            addToBackStack("mainStackFragments")
        }
    }
}