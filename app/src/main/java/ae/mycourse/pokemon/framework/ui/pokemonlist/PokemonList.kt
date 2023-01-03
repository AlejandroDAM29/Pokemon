package ae.mycourse.pokemon.framework.ui.pokemonlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.databinding.FragmentPokemonListBinding
import ae.mycourse.pokemon.domain.ListPokemonsModel
import android.annotation.SuppressLint
import android.util.Log
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class PokemonList : Fragment(), SearchView.OnQueryTextListener {

    private var _binding: FragmentPokemonListBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val pokemonListViewModel : PokemonListViewModel by viewModels()
    lateinit var recyclerListAdapter: MyRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentPokemonListBinding.inflate(inflater, container, false)
        val view = binding.root

        recyclerListAdapter = MyRecyclerAdapter(pokemonListViewModel.pokemonList.value)
        binding.recyclerViewList.adapter = recyclerListAdapter

        pokemonListViewModel.pokemonList.observe(viewLifecycleOwner){ pokemons ->
            recyclerListAdapter.pokemonList = pokemons
            recyclerListAdapter.notifyDataSetChanged()
        }

        binding.searchbarList.setOnQueryTextListener(this)

        pokemonListViewModel.getPokemonList(requireContext())
        return view
    }

    override fun onQueryTextSubmit(query: String?): Boolean = true

    @SuppressLint("NotifyDataSetChanged")
    override fun onQueryTextChange(newText: String?): Boolean {
        recyclerListAdapter.pokemonList = pokemonListViewModel.filterList(newText)
        recyclerListAdapter.notifyDataSetChanged()
        return true
    }
}