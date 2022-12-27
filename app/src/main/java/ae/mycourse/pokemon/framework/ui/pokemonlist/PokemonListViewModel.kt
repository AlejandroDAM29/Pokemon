package ae.mycourse.pokemon.framework.ui.pokemonlist

import ae.mycourse.pokemon.domain.ListPokemonsModel
import ae.mycourse.pokemon.usescases.GetPokemonsListUseCase
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonListViewModel @Inject constructor (private val getPokemonsListUseCase: GetPokemonsListUseCase) : ViewModel() {
    private var _pokemonsList = MutableLiveData<ListPokemonsModel>()
    val pokemonList: LiveData<ListPokemonsModel> get() = _pokemonsList


    fun getPokemonList(): ListPokemonsModel {

        viewModelScope.launch {
            _pokemonsList = ListPokemonsModel(mutableListOf(), mutableListOf())
        }
    }





}