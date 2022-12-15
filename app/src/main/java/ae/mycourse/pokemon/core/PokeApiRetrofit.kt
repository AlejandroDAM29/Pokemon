package ae.mycourse.pokemon.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PokeApiRetrofit {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}