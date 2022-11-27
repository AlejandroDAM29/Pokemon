package ae.mycourse.pokemon.interfacesadapter.gateway

import ae.mycourse.pokemon.business.aplicationservices.models.PokeApiDetailsModel
import ae.mycourse.pokemon.business.aplicationservices.models.ResultListApiModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiClient {

    @GET(value = "pokemon?limit=1154")
    suspend fun getListPokemon(): Response<ResultListApiModel>

    @GET(value = "pokemon/{id}")
    suspend fun getDetailsPokemon(@Path("id") id: Int): Response<PokeApiDetailsModel>
}