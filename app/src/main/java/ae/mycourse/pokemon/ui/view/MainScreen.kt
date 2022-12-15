package ae.mycourse.pokemon.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.business.aplicationservices.Utils
import ae.mycourse.pokemon.core.PokeApiRetrofit
import ae.mycourse.pokemon.data.model.AllPokemonsModel
import ae.mycourse.pokemon.data.network.PokemonApiClient
import android.widget.Button
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainScreen : Fragment() {

    lateinit var buttonPokedex: Button
    lateinit var buttonFavourites: Button
    var bundle = Bundle()
    lateinit var utils: Utils

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view  = inflater.inflate(R.layout.fragment_main_screen, container, false)
        utils = Utils(requireContext())
        buttonPokedex = view.findViewById(R.id.buttonPokedex)
        buttonFavourites = view.findViewById(R.id.buttonFavorourites)
        //Buttons listeners
        buttonPokedex.setOnClickListener{
            getPokemonList()
        }
        buttonFavourites.setOnClickListener{
            bundle.putString("fragmentData",getString(R.string.fragmentErrorFavourites))
            /*nextFragment(FragmentError())*/
        }
        return view
    }

    fun getPokemonList() {
        utils.showCustomProgressDialog()
        lateinit var pokemonNamesList: AllPokemonsModel
        var newArrayList: ArrayList<String> = ArrayList()
        var arrayListImages: ArrayList<String> = ArrayList()
        CoroutineScope(Dispatchers.IO).launch {
            val call = PokeApiRetrofit.getRetrofit().create(PokemonApiClient::class.java).getListPokemon()
            val links = call.body()
            if (call.isSuccessful){
                if (links != null) {
                    pokemonNamesList = links
                    for(i in links.results) {
                        newArrayList.add(i.name)
                        val callData = PokeApiRetrofit.getRetrofit().create(PokemonApiClient::class.java).getDetailsPokemon(i.name)
                        if(callData.isSuccessful)
                            arrayListImages.add(callData.body()!!.sprites.front_default)
                        utils.setProgressCircleDialog(newArrayList.size,  getText(R.string.loadingDownloadDialog).toString()+" "+ newArrayList.size + " "+getString(R.string.loadingDownloadDialog2).toString())
                    }
                    bundle.putStringArrayList("listPokemonNames", newArrayList)
                    bundle.putStringArrayList("listImagePokemon", arrayListImages)
                    utils.closeCustomProgressDialog()
                    nextFragment(PokemonList())
                }
            }else{
                bundle.putString("fragmentData", getString(R.string.fragmentErrorConection))
                /*utils.closeCustomProgressDialog()*/
                nextFragment(FragmentError())
            }
        }
    }

    fun nextFragment(fragment:Fragment){
        fragment.arguments = bundle
        fragmentManager?.beginTransaction()?.replace(R.id.fragmentContainer,fragment)?.commit()
    }
}