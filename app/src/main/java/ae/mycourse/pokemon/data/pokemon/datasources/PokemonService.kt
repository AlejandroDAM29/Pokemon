package ae.mycourse.pokemon.data.pokemon.datasources

import ae.mycourse.pokemon.core.PokeApiRetrofit
import ae.mycourse.pokemon.domain.AllPokemonsModel
import ae.mycourse.pokemon.domain.DetailsPokemonModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PokemonService {
    private val retrofit = PokeApiRetrofit.getRetrofit()

    suspend fun getPokemonDetails(name: String): DetailsPokemonModel? {
        return withContext(Dispatchers.IO){
            retrofit.create(PokemonApiClient::class.java).getDetailsPokemon(name).body()
        }
    }

    suspend fun getPokemonNames(): AllPokemonsModel? {
        return withContext(Dispatchers.IO){
            retrofit.create(PokemonApiClient::class.java).getListPokemon().body()
        }

    }

}