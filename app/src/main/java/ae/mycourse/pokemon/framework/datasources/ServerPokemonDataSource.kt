package ae.mycourse.pokemon.framework.datasources

import ae.mycourse.pokemon.data.pokemon.datasources.PokemonApiService
import ae.mycourse.pokemon.domain.URLBaseModel
import ae.mycourse.pokemon.framework.datasources.domain.allpokemon.AllPokemonsModelResponse
import ae.mycourse.pokemon.framework.datasources.domain.detailspokemon.DetailsPokemonModelResponse
import ae.mycourse.pokemon.framework.datasources.domain.base.URLBaseResponse
import android.util.Log
import retrofit2.Response

class ServerPokemonDataSource(private val pokeApiRemoteService: PokeApiRemoteService): PokemonApiService {

    override suspend fun getListNamesPokemon(): MutableList<String> {
        val allPokemon = pokeApiRemoteService.getListPokemon()
        var pokemonNames: MutableList<String> = mutableListOf()
        for(result in allPokemon.results){
            pokemonNames.add(result.name)
        }
        return pokemonNames
    }

    override suspend fun getImagePokemon(id: String): String {
        return pokeApiRemoteService.getDetailsPokemon(id).sprites.front_default
    }
}