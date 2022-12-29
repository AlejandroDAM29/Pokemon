package ae.mycourse.pokemon.framework.ui.pokemonlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.databinding.FragmentPokemonListBinding
import ae.mycourse.pokemon.framework.common.DialogProgressCircleBar
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


//Esto es para que las inyecciones no estén vivas toda la aplicación. Para ello se usa la siguiente anotación. Si se usa
//en un fragmento, se debe inyectar las dependencias en las clases que use este fragmento
@AndroidEntryPoint
class PokemonList : Fragment() {

    private var _binding: FragmentPokemonListBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val pokemonListViewModel : PokemonListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentPokemonListBinding.inflate(inflater, container, false)
        val view = binding.root

        var recyclerListAdapter = MyRecyclerAdapter(pokemonListViewModel.pokemonList.value?.names, pokemonListViewModel.pokemonList.value?.images)
        binding.recyclerViewList.adapter = recyclerListAdapter

        pokemonListViewModel.pokemonList.observe(viewLifecycleOwner){ pokemons ->
            recyclerListAdapter.newList = pokemons.names
            recyclerListAdapter.imageList = pokemons.images
        }




        //TODO A este recycler le voy a meter el caso de uso para poder pillar los pokemons
        var myRecycler = binding.recyclerViewList
        pokemonListViewModel.getPokemonList(requireContext())
        return view
    }

}