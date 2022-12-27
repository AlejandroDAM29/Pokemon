package ae.mycourse.pokemon.data.pokemon.repositories

import ae.mycourse.pokemon.data.pokemon.datasources.PokemonApiService

class PokemonRepository (private val pokemonApiService: PokemonApiService){

    suspend fun getListPokemon() = pokemonApiService.getListNamesPokemon()
    suspend fun getImagesPokemon(id: String) = pokemonApiService.getImagePokemon(id)
}