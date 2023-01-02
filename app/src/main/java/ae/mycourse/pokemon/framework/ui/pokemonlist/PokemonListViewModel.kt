package ae.mycourse.pokemon.framework.ui.pokemonlist

import ae.mycourse.pokemon.domain.ListPokemonsModel
import ae.mycourse.pokemon.framework.common.DialogProgressCircleBar
import ae.mycourse.pokemon.usescases.FilterListUseCase
import ae.mycourse.pokemon.usescases.GetPokemonsListUseCase
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
class PokemonListViewModel @Inject constructor(private val getPokemonsListUseCase: GetPokemonsListUseCase) : ViewModel() {

    private var _pokemonsList = MutableLiveData<ListPokemonsModel>()
    val pokemonList: LiveData<ListPokemonsModel> get() = _pokemonsList


    fun getPokemonList(context: Context) {
        viewModelScope.launch {
            _pokemonsList.value = getPokemonsListUseCase.invoke(context)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun filterList(nameSearched: String?) {
        //Conseguir una lista con el objeto completo pokemon. Lo pasará por live data y entonces activo el notifydatasert en
        //la clase que maneja la interfaz de usuario


        /*
        Log.i("mensaje query","Entra en la query")
        *//*pokemonListViewModel.filterList("hola")*//*
        var names : MutableList<String> = mutableListOf()
        var images : MutableList<String> = mutableListOf()
        names.add("pikachu")
        images.add("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png")

        recyclerListAdapter.newList = names
        recyclerListAdapter.imageList = images
        recyclerListAdapter.notifyDataSetChanged()*/
    }

}