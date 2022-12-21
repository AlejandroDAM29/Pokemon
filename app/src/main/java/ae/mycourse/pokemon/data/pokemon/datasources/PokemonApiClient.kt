package ae.mycourse.pokemon.data.pokemon.datasources

import ae.mycourse.pokemon.domain.AllPokemonsModel
import ae.mycourse.pokemon.domain.DetailsPokemonModel
import ae.mycourse.pokemon.domain.URLBaseResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApiClient {
    @GET(".")
    suspend fun getURLBaseContent(): Response<URLBaseResponse>


    @GET("pokemon?limit=150&offset=0")
    suspend fun getListPokemon(): Response<AllPokemonsModel>

    @GET(value = "pokemon/{id}")
    suspend fun getDetailsPokemon(@Path("id") id: String): Response<DetailsPokemonModel>
}