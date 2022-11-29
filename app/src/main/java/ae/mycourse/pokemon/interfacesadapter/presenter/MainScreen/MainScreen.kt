package ae.mycourse.pokemon.interfacesadapter.presenter.MainScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.business.modelservices.AllPokemonsModel
import ae.mycourse.pokemon.interfacesadapter.gateway.ApiClient
import ae.mycourse.pokemon.interfacesadapter.gateway.PokeApiRetrofit
import ae.mycourse.pokemon.interfacesadapter.presenter.FragmentError
import ae.mycourse.pokemon.interfacesadapter.presenter.pokemonlist.PokemonList
import android.util.Log
import android.widget.Button
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainScreen : Fragment() {

    lateinit var buttonPokedex: Button
    lateinit var buttonFavourites: Button
    var bundle = Bundle()

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
            getPokemonList()
        }
        buttonFavourites.setOnClickListener{
            //TODO Male call in to retrofit. If you find success respond you must load fragment favourites, else you load fragment error
            bundle.putString("fragmentData","Why you don't have any favourites pokemon yet?")
            /*nextFragment(FragmentError())*/
        }
        return view
    }

    fun getPokemonList() {
        lateinit var pokemonNamesList: AllPokemonsModel
        var newArrayList: ArrayList<String> = ArrayList()
        CoroutineScope(Dispatchers.IO).launch {
            val call = PokeApiRetrofit().getRetrofit().create(ApiClient::class.java).getListPokemon()
            val enlaces = call.body()
            if (call.isSuccessful){
                if (enlaces != null) {
                    pokemonNamesList = enlaces
                    for(i in enlaces.results){
                        newArrayList.add(i.name)
                    }
                    bundle.putStringArrayList("listaPokemon", newArrayList)
                    nextFragment(PokemonList())
                }
            }else{
                bundle.putString("fragmentData","Ups, your pokemon dont have connection")
                nextFragment(FragmentError())
            }
        }
    }

    private fun nextFragment(fragment:Fragment){
        fragment.arguments = bundle
        fragmentManager?.beginTransaction()?.replace(R.id.fragmentContainer,fragment)?.commit()
    }
}