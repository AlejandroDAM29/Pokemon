package ae.mycourse.pokemon.interfacesadapter.gateway

import ae.mycourse.pokemon.business.aplicationservices.models.PokeApiDetailsModel
import ae.mycourse.pokemon.business.aplicationservices.models.ResultListApiModel
import ae.mycourse.pokemon.business.modelservices.AllPokemonsModel
import ae.mycourse.pokemon.business.modelservices.URLBaseResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Url

interface ApiClient {
    @GET(".")
    suspend fun getURLBaseContent(): Response<URLBaseResponse>


    //TODO Revisar estos campos
    @GET("pokemon?limit=100000&offset=0")
    suspend fun getListPokemon(): Response<AllPokemonsModel>

    @GET(value = "pokemon/{id}")
    fun getDetailsPokemon(@Path("id") id: Int): Response<PokeApiDetailsModel>
}