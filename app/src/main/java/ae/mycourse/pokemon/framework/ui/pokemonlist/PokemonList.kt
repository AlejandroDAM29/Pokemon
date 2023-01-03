package ae.mycourse.pokemon.framework.ui.pokemonlist

import ae.mycourse.pokemon.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.databinding.FragmentPokemonListBinding
import ae.mycourse.pokemon.domain.ListPokemonsModel
import ae.mycourse.pokemon.framework.common.onTextChanged
import android.annotation.SuppressLint
import android.text.Editable
import android.util.Log
import androidx.appcompat.widget.SearchView
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class PokemonList : Fragment() {

    private var _binding: FragmentPokemonListBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val pokemonListViewModel : PokemonListViewModel by viewModels()
    private lateinit var recyclerListAdapter: MyRecyclerAdapter

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

        binding.searchbarList.addTextChangedListener {
           showIconSearchbar(it)
            recyclerListAdapter.pokemonList = pokemonListViewModel.filterList(it.toString().lowercase())
            recyclerListAdapter.notifyDataSetChanged()
        }
        pokemonListViewModel.getPokemonList(requireContext())
        return view
    }

    private fun showIconSearchbar(editable: Editable?){
        var icon: Int = 0
        if (editable.toString() == "")
            icon = R.drawable.loupe
        binding.searchbarList.setCompoundDrawablesWithIntrinsicBounds(icon,0,0,0)
    }
}

