package ae.mycourse.pokemon.framework

import ae.mycourse.pokemon.data.pokemon.datasources.PokemonApiService
import ae.mycourse.pokemon.framework.common.DialogProgressCircleBar
import ae.mycourse.pokemon.framework.datasources.PokeApiRemoteService
import ae.mycourse.pokemon.framework.datasources.ServerPokemonDataSource
import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FrameworkModule {

    @Provides
    @Singleton
    @Named("baseUrl")
    fun baseUrlProvider(): String = "https://pokeapi.co/api/v2/"

    @Provides
    @Singleton
    fun retrofitProvider(@Named("baseUrl") baseUrl: String): Retrofit =
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    @Singleton
    fun pokeApiRemoteServiceProvider(retrofit: Retrofit): PokeApiRemoteService = retrofit.create(PokeApiRemoteService::class.java)

    @Provides
    fun pokemonApiClient(pokeApiRemoteService: PokeApiRemoteService): PokemonApiService{
        return ServerPokemonDataSource(pokeApiRemoteService)
    }


}