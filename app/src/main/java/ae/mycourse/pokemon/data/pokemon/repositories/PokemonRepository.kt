package ae.mycourse.pokemon.data.pokemon.repositories

import ae.mycourse.pokemon.data.pokemon.datasources.PokemonApiService
import ae.mycourse.pokemon.data.pokemon.databases.PokemonDao
import ae.mycourse.pokemon.data.pokemon.databases.entities.FavouriteList

class PokemonRepository (private val pokemonApiService: PokemonApiService, private val pokemonDao: PokemonDao){

    suspend fun getListPokemon() = pokemonApiService.getPokemonList()
    fun getFavouritePokemons() = pokemonDao.getFavouriteList()
    suspend fun insertFavouritePokemon(name: String) = pokemonDao.insertFavouritePokemon(
        FavouriteList(null,name))
}