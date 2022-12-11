package ae.mycourse.pokemon.interfacesadapter.gateway

import ae.mycourse.pokemon.business.modelservices.AllPokemonsModel
import ae.mycourse.pokemon.business.modelservices.DetailsPokemonModel
import ae.mycourse.pokemon.business.modelservices.URLBaseResponse
import ae.mycourse.pokemon.interfacesadapter.presenter.pokemondetails.PokemonDetails
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Url

interface ApiClient {
    @GET(".")
    suspend fun getURLBaseContent(): Response<URLBaseResponse>


    @GET("pokemon?limit=150&offset=0")
    suspend fun getListPokemon(): Response<AllPokemonsModel>

    @GET(value = "pokemon/{id}")
    suspend fun getDetailsPokemon(@Path("id") id: String): Response<DetailsPokemonModel>
}