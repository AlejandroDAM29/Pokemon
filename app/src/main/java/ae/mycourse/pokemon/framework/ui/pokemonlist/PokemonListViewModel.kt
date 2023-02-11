package ae.mycourse.pokemon.framework.ui.pokemonlist

import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.data.pokemon.databases.entities.FavouriteList
import ae.mycourse.pokemon.domain.ListPokemonsModel
import ae.mycourse.pokemon.framework.common.DialogProgressCircleBar
import ae.mycourse.pokemon.usescases.FilterListUseCase
import ae.mycourse.pokemon.usescases.GetPokemonsListUseCase
import ae.mycourse.pokemon.usescases.ObtainFavouriteListUseCase
import android.annotation.SuppressLint
import android.content.Context
import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonListViewModel @Inject constructor(private val getPokemonsListUseCase: GetPokemonsListUseCase,
                                               obtainFavouriteListUseCase: ObtainFavouriteListUseCase,
                                               private val filterListUseCase: FilterListUseCase,
                                               private val progressCircleDialog: DialogProgressCircleBar) : ViewModel() {

    private var _pokemonsList = MutableLiveData<ListPokemonsModel>()
    val pokemonList: LiveData<ListPokemonsModel> get() = _pokemonsList
    var favouritePokemons: LiveData<MutableList<FavouriteList>> = obtainFavouriteListUseCase.invoke()

    fun getPokemonList(context: Context) {
        viewModelScope.launch {
            progressCircleDialog.showCustomProgressDialog(context, R.string.loadingDownloadDialog)
            _pokemonsList.value = getPokemonsListUseCase.invoke(context)
            progressCircleDialog.customProgressDialog.cancel()
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun filterList(keyword: String?): ListPokemonsModel = filterListUseCase.invoke(keyword, _pokemonsList.value)

}