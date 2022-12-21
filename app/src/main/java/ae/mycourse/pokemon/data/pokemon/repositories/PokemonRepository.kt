package ae.mycourse.pokemon.data.pokemon.repositories

import ae.mycourse.pokemon.data.pokemon.datasources.PokemonApiClient
import ae.mycourse.pokemon.domain.AllPokemonsModel
import ae.mycourse.pokemon.domain.DetailsPokemonModel
import ae.mycourse.pokemon.domain.URLBaseResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

class PokemonRepository (private val pokemonApiClient: PokemonApiClient){

    suspend fun getURLBaseContent() = pokemonApiClient.getURLBaseContent()
    suspend fun getListPokemon() = pokemonApiClient.getListPokemon()
    suspend fun getDetailsPokemon(id: String) = pokemonApiClient.getDetailsPokemon(id)
}