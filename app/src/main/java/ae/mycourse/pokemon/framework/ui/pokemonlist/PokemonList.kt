package ae.mycourse.pokemon.framework.ui.pokemonlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.databinding.FragmentMainScreenBinding
import ae.mycourse.pokemon.databinding.FragmentPokemonListBinding
import androidx.fragment.app.viewModels

class PokemonList : Fragment() {
    private var _binding: FragmentPokemonListBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val pokemonListViewModel : PokemonListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentPokemonListBinding.inflate(inflater, container, false)
        val view = binding.root

        var recyclerListAdapter = MyRecyclerAdapter(pokemonListViewModel.pokemonNames.value, pokemonListViewModel.pokemonImages.value)
        binding.recyclerViewList.adapter = recyclerListAdapter

        pokemonListViewModel.pokemonNames.observe(viewLifecycleOwner){ names ->
            recyclerListAdapter.newList = names
        }

        pokemonListViewModel.pokemonImages.observe(viewLifecycleOwner){ images ->
            recyclerListAdapter.imageList = images
        }



        PokemonListViewModel().getPokemonList()

        //TODO A este recycler le voy a meter el caso de uso para poder pillar los pokemons
        var myRecycler = binding.recyclerViewList
        return view
    }

}