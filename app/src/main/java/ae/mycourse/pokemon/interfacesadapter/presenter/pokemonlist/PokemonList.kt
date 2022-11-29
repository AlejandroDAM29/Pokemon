package ae.mycourse.pokemon.interfacesadapter.presenter.pokemonlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.aplications.MyRecyclerAdapter
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PokemonList : Fragment() {
    private lateinit var searchBar: SearchView
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyRecyclerAdapter

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
        var pokemonList = arguments?.getStringArrayList("listaPokemon")
        adapter = MyRecyclerAdapter(pokemonList)
        recyclerView.adapter = adapter
        return view
    }


}