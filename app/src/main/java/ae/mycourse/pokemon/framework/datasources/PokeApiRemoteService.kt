package ae.mycourse.pokemon.framework.datasources

import ae.mycourse.pokemon.framework.datasources.domain.listpokemon.ListPokemonResponse
import retrofit2.http.GET

interface PokeApiRemoteService {

    /*@GET(".")
    suspend fun getURLBaseContent(): URLBaseResponse

    @GET("pokemon?limit=150&offset=0")
    suspend fun getListPokemon(): AllPokemonsModelResponse

    @GET(value = "pokemon/{id}")
    suspend fun getDetailsPokemon(@Path("id") id: String): DetailsPokemonModelResponse*/
    @GET("https://www.alejandroexpdeveloper.com/backend_pokemon/endpoints/pokemon_list.php")
    suspend fun getListPokemon(): MutableList<ListPokemonResponse>
}