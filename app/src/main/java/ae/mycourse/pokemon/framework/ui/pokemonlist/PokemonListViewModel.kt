package ae.mycourse.pokemon.framework.ui.pokemonlist

import ae.mycourse.pokemon.data.pokemon.repositories.PokemonRepository
import ae.mycourse.pokemon.framework.data.datasources.ServerPokemonDataSource
import ae.mycourse.pokemon.usescases.GetPokemonImagesListUseCase
import ae.mycourse.pokemon.usescases.GetPokemonNamesListUseCase
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PokemonListViewModel : ViewModel() {

    private val getPokemonNamesListUseCase = GetPokemonNamesListUseCase(PokemonRepository(ServerPokemonDataSource()))
    private val getPokemonImagesListUseCase = GetPokemonImagesListUseCase(PokemonRepository(ServerPokemonDataSource()))

    private val _pokemonNames = MutableLiveData<MutableList<String>>()
    val pokemonNames: LiveData<MutableList<String>> get() = _pokemonNames

    private val _pokemonImages = MutableLiveData<MutableList<String>>()
    val pokemonImages: LiveData<MutableList<String>> get() = _pokemonImages

    fun getPokemonList() {
        /*_pokemonNames = getPokemonNamesListUseCase.invoke()
        _pokemonImages = getPokemonImagesListUseCase.invoke()*/
    }




}