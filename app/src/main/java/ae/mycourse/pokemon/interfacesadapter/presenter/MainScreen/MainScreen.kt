package ae.mycourse.pokemon.interfacesadapter.presenter.MainScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.interfacesadapter.presenter.FragmentError
import ae.mycourse.pokemon.interfacesadapter.presenter.pokemondetails.PokemonDetails
import ae.mycourse.pokemon.interfacesadapter.presenter.pokemonlist.PokemonList
import android.widget.Button

class MainScreen : Fragment() {

    lateinit var buttonPokedex: Button
    lateinit var buttonFavourites: Button
    val bundle = Bundle()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view  = inflater.inflate(R.layout.fragment_main_screen, container, false)
        buttonPokedex = view.findViewById(R.id.buttonPokedex)
        buttonFavourites = view.findViewById(R.id.buttonFavorourites)
        //Buttons listeners
        buttonPokedex.setOnClickListener{

            //TODO Male call in to retrofit. If you find success respond you must load fragment List, else you load fragment error
            bundle.putString("fragmentData","Sorry your pokemon don't have internet")
            nextFragment(PokemonDetails())
        }
        buttonFavourites.setOnClickListener{
            //TODO Male call in to retrofit. If you find success respond you must load fragment favourites, else you load fragment error
            bundle.putString("fragmentData","Why you don't have any favourites pokemon yet?")
            nextFragment(FragmentError())
        }
        return view
    }

    private fun nextFragment(fragment:Fragment){
        fragment.arguments = bundle
        fragmentManager?.beginTransaction()?.replace(R.id.fragmentContainer,fragment)?.commit()
    }
}