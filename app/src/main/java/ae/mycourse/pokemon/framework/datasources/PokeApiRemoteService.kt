package ae.mycourse.pokemon.framework.datasources

import ae.mycourse.pokemon.framework.datasources.domain.listpokemon.ListPokemonResponse
import retrofit2.http.GET

interface PokeApiRemoteService {

    @GET("https://www.alejandroexpdeveloper.com/backend_pokemon/endpoints/pokemon_list.php")
    suspend fun getListPokemon(): MutableList<ListPokemonResponse>
}