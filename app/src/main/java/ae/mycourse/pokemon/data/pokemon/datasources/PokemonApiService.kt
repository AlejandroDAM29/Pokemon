package ae.mycourse.pokemon.data.pokemon.datasources

import ae.mycourse.pokemon.domain.ListPokemonsModel

interface PokemonApiService {

    /*suspend fun getListNamesPokemon(): MutableList<String>

    suspend fun getImagePokemon(id:String): String*/

    suspend fun getPokemonList(): ListPokemonsModel
}