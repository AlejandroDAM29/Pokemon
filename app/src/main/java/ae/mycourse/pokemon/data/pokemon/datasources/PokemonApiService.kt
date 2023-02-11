package ae.mycourse.pokemon.data.pokemon.datasources

import ae.mycourse.pokemon.domain.ListPokemonsModel

interface PokemonApiService {

    suspend fun getPokemonList(): ListPokemonsModel
}