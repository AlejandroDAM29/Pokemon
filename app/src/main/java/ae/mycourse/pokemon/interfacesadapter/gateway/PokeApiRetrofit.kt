package ae.mycourse.pokemon.interfacesadapter.gateway

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PokeApiRetrofit {
    val BASE_URL = "https://pokeapi.co/api/v2/"

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }
}