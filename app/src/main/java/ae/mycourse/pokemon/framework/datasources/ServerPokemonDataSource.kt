package ae.mycourse.pokemon.framework.datasources

import ae.mycourse.pokemon.data.pokemon.datasources.PokemonApiService
import ae.mycourse.pokemon.domain.ListPokemonsModel
import android.util.Log

class ServerPokemonDataSource(private val pokeApiRemoteService: PokeApiRemoteService): PokemonApiService {

    /*override suspend fun getListNamesPokemon(): MutableList<String> {
        val allPokemon = pokeApiRemoteService.getListPokemon()
        var pokemonNames: MutableList<String> = mutableListOf()
        for(result in allPokemon.results){
            pokemonNames.add(result.name)
        }
        return pokemonNames
    }

    override suspend fun getImagePokemon(id: String): String {
        return pokeApiRemoteService.getDetailsPokemon(id).sprites.front_default
    }*/

    override suspend fun getPokemonList(): ListPokemonsModel {
        val response = pokeApiRemoteService.getListPokemon()
        Log.i("Test 1", response.toString())
        val pokemonNames: MutableList<String> = mutableListOf()
        val pokemonImages: MutableList<String> = mutableListOf()

        for (result in response){
            pokemonNames.add(result.name)
            pokemonImages.add(result.url)
        }

        return ListPokemonsModel(names = pokemonNames, images = pokemonImages)
    }
}