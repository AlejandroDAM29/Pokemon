package ae.mycourse.pokemon.data.pokemon.repositories

import ae.mycourse.pokemon.data.pokemon.datasources.PokemonApiService
import ae.mycourse.pokemon.data.pokemon.datasources.PokemonDao

class PokemonRepository (private val pokemonApiService: PokemonApiService, private val pokemonDao: PokemonDao){

    suspend fun getListPokemon() = pokemonApiService.getPokemonList()
    suspend fun getFavouritePokemons() = pokemonDao.getFavouriteList()
    /*suspend fun insertAllPokemonList(pokemonList: MutableList<PokemonListEntity>) = pokemonDao.insertAllPokemonList(pokemonList)
    suspend fun getAllPokemonList() = pokemonDao.getAllPokemonList()*/
}