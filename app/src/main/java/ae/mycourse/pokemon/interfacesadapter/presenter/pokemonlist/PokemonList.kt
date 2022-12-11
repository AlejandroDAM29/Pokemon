package ae.mycourse.pokemon.interfacesadapter.presenter.pokemonlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.aplications.MyRecyclerAdapter
import ae.mycourse.pokemon.business.modelservices.AllPokemonsModel
import ae.mycourse.pokemon.interfacesadapter.gateway.ApiClient
import ae.mycourse.pokemon.interfacesadapter.gateway.PokeApiRetrofit
import android.annotation.SuppressLint
import android.content.Context
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PokemonList : Fragment(), SearchView.OnQueryTextListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyRecyclerAdapter
    private var pokemonNames: MutableList<String>? = null
    private var pokemonImages: MutableList<String>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_pokemon_list, container, false)
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        pokemonNames = arguments?.getStringArrayList("listaPokemon")
        pokemonImages = arguments?.getStringArrayList("listImagePokemon")
        adapter = MyRecyclerAdapter(pokemonNames, pokemonImages)
        recyclerView.adapter = adapter
        //Lister searchbar
        var searchbarList: SearchView = view.findViewById(R.id.searchbarList)
        searchbarList.setOnQueryTextListener(this)
        return view
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateList(){
        lateinit var pokemonList: AllPokemonsModel
        CoroutineScope(Dispatchers.IO).launch {
            val call = PokeApiRetrofit().getRetrofit().create(ApiClient::class.java).getListPokemon()
            val enlaces = call.body()
            adapter.imageList?.clear()
            adapter.newList?.clear()
            if (call.isSuccessful){
                activity?.runOnUiThread {
                    if (enlaces != null) {
                        pokemonList = enlaces
                        for (i in enlaces.results)
                            adapter.newList?.add(i.name)
                        adapter.notifyDataSetChanged()
                    }
                }
            }else{
                Toast.makeText(context, "No hay conexión", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        Toast.makeText(context,"hola, estoy buscando", Toast.LENGTH_LONG).show()
        hideKeyboard()
        return true
    }

    private fun hideKeyboard() {
        val inputMethodManager = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view?.windowToken, 0)
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        updateList()
        return true
    }

}