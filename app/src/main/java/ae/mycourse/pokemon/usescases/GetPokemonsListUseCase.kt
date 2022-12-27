package ae.mycourse.pokemon.usescases

import ae.mycourse.pokemon.data.pokemon.repositories.PokemonRepository
import ae.mycourse.pokemon.domain.ListPokemonsModel
import ae.mycourse.pokemon.domain.PokemonProviderModel
import ae.mycourse.pokemon.framework.common.DialogProgressCircleBar
import ae.mycourse.pokemon.framework.datasources.domain.allpokemon.AllPokemonsModelResponse
import android.app.Activity
import android.app.Application
import android.content.Context
import android.util.Log
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_ApplicationContextModule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class GetPokemonsListUseCase(private val pokemonRepository: PokemonRepository, private val progressDialog: DialogProgressCircleBar) {

    //TODO Aquí es donde debo acoplar las dos llamadas de retrofit para recuperar el objeto de la lista entera.
    /*suspend fun invoke(): MutableList<String> = pokemonRepository.getListPokemon()*/
    suspend fun invoke(): ListPokemonsModel{
        val pokemonImages: MutableList<String> = mutableListOf()
        progressDialog.showCustomProgressDialog()
        val pokemonNames = pokemonRepository.getListPokemon()
        for (name in pokemonNames){
            pokemonImages.add(pokemonRepository.getImagesPokemon(name))
            progressDialog.setProgressCircleDialog(calculatePercentPokemonLoaded(pokemonImages.size),
                "hola"
            )
        }
        progressDialog.closeCustomProgressDialog()
        return ListPokemonsModel(pokemonNames,pokemonImages)
    }

    private fun calculatePercentPokemonLoaded(pokemonsLoaded: Int): Int{
        return (pokemonsLoaded*100)/150
    }

}