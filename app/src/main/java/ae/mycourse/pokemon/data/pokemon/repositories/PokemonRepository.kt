package ae.mycourse.pokemon.data.pokemon.repositories

import ae.mycourse.pokemon.data.pokemon.datasources.PokemonApiService
import ae.mycourse.pokemon.data.pokemon.datasources.PokemonDao
import ae.mycourse.pokemon.data.pokemon.entities.PokemonListEntity
import ae.mycourse.pokemon.domain.ListPokemonsModel

class PokemonRepository (private val pokemonApiService: PokemonApiService, private val pokemonDao: PokemonDao){

    /*suspend fun getListPokemon() = pokemonApiService.getListNamesPokemon()
    suspend fun getImagesPokemon(id: String) = pokemonApiService.getImagePokemon(id)*/
    suspend fun getListPokemon() = pokemonApiService.getPokemonList()
    suspend fun insertAllPokemonList(pokemonList: MutableList<PokemonListEntity>) = pokemonDao.insertAllPokemonList(pokemonList)
    suspend fun getAllPokemonList() = pokemonDao.getAllPokemonList()
}