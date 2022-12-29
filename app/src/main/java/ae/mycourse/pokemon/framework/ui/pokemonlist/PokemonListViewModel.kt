package ae.mycourse.pokemon.framework.ui.pokemonlist

import ae.mycourse.pokemon.domain.ListPokemonsModel
import ae.mycourse.pokemon.framework.common.DialogProgressCircleBar
import ae.mycourse.pokemon.usescases.GetPokemonsListUseCase
import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonListViewModel @Inject constructor(private val getPokemonsListUseCase: GetPokemonsListUseCase) : ViewModel() {

    private var _pokemonsList = MutableLiveData<ListPokemonsModel>()
    val pokemonList: LiveData<ListPokemonsModel> get() = _pokemonsList


    fun getPokemonList(context: Context) {

        viewModelScope.launch {
            _pokemonsList.value = getPokemonsListUseCase.invoke(context)
        }
    }

}