package ae.mycourse.pokemon.data

import ae.mycourse.pokemon.data.model.AllPokemonsModel
import ae.mycourse.pokemon.data.model.DetailsPokemonModel
import ae.mycourse.pokemon.data.network.PokemonService
import ae.mycourse.pokemon.data.providerClasses.PokemonProvider

class PokemonRepository {
    val api = PokemonService()

    suspend fun getPokemonNames(): AllPokemonsModel? {
        val response = api.getPokemonNames()
        if (response != null) {
            PokemonProvider.pokemonNames = response
        }
        return response
    }

    suspend fun getPokemonDetails(name: String): DetailsPokemonModel?{
        val response = api.getPokemonDetails(name)
        if (response != null) {
            PokemonProvider.pokemonDetails = response
        }
        return response
    }
}