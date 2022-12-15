package ae.mycourse.pokemon.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.aplication.MyRecyclerAdapter
import android.content.Context
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

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
        pokemonNames = arguments?.getStringArrayList("listPokemonNames")
        pokemonImages = arguments?.getStringArrayList("listImagePokemon")
        adapter = MyRecyclerAdapter(pokemonNames, pokemonImages)
        recyclerView.adapter = adapter
        //Lister searchbar
        var searchbarList: SearchView = view.findViewById(R.id.searchbarList)
        searchbarList.setOnQueryTextListener(this)
        return view
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        if (!query.isNullOrEmpty() && !pokemonNames.isNullOrEmpty())
            filter(query.lowercase())
        else
            filter("")
        hideKeyboard()
        return true
    }

    private fun hideKeyboard() {
        val inputMethodManager = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view?.windowToken, 0)
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        filter(newText!!.lowercase())
        return true
    }

    fun filter(query: String){
            var pokemonNamesFiltered: MutableList<String> = ArrayList()
            var pokemonImagesFiltered: MutableList<String> = ArrayList()
            for ((index, i) in pokemonNames!!.withIndex()) {
                if (i.contains(query)) {
                    pokemonNamesFiltered.add(i)
                    pokemonImagesFiltered.add(pokemonImages!![index])
                }
            }
            adapter.filterList(pokemonNamesFiltered, pokemonImagesFiltered)
    }

}