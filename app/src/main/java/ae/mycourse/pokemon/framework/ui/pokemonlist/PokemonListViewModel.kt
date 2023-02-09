package ae.mycourse.pokemon.framework.ui.pokemonlist

import ae.mycourse.pokemon.domain.ListPokemonsModel
import ae.mycourse.pokemon.framework.common.DialogProgressCircleBar
import ae.mycourse.pokemon.usescases.FilterListUseCase
import ae.mycourse.pokemon.usescases.GetPokemonsListUseCase
import ae.mycourse.pokemon.usescases.ObtainFavouriteListUseCase
import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonListViewModel @Inject constructor(private val getPokemonsListUseCase: GetPokemonsListUseCase,
                                               private val obtainFavouriteListUseCase: ObtainFavouriteListUseCase,
                                               private val filterListUseCase: FilterListUseCase) : ViewModel() {

    private var _pokemonsList = MutableLiveData<ListPokemonsModel>()
    val pokemonList: LiveData<ListPokemonsModel> get() = _pokemonsList
    private var _favouritePokemons = MutableLiveData<MutableList<String>>()
    val favouritePokemons: LiveData<MutableList<String>> get() = _favouritePokemons


    fun getPokemonList(context: Context) {
        viewModelScope.launch {
            _pokemonsList.value = getPokemonsListUseCase.invoke(context)
            _favouritePokemons.value = obtainFavouriteListUseCase.invoke()
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun filterList(keyword: String?): ListPokemonsModel = filterListUseCase.invoke(keyword, _pokemonsList.value)

}