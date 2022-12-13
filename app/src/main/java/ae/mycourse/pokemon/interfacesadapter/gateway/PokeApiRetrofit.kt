package ae.mycourse.pokemon.interfacesadapter.gateway

import android.content.Context
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient




class PokeApiRetrofit() {
    val BASE_URL = "https://pokeapi.co/api/v2/"


    fun getRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

}