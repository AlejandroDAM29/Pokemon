package ae.mycourse.pokemon.framework

import ae.mycourse.pokemon.data.pokemon.databases.PokemonDatabase
import ae.mycourse.pokemon.data.pokemon.datasources.PokemonApiService
import ae.mycourse.pokemon.data.pokemon.datasources.PokemonDao
import ae.mycourse.pokemon.domain.ListPokemonsModel
import ae.mycourse.pokemon.framework.common.DialogProgressCircleBar
import ae.mycourse.pokemon.framework.datasources.PokeApiRemoteService
import ae.mycourse.pokemon.framework.datasources.ServerPokemonDataSource
import ae.mycourse.pokemon.usescases.FilterListUseCase
import android.app.Application
import android.content.Context
import androidx.room.Room
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
    fun pokemonApiClient(pokeApiRemoteService: PokeApiRemoteService): PokemonApiService =
        ServerPokemonDataSource(pokeApiRemoteService)

    @Provides
    @Singleton
    @Named("nameDatabase")
    fun nameRoomDatabase(): String = "pokemon_database2"

    @Provides
    @Singleton
    fun roomProvider(@ApplicationContext context:Context, @Named("nameDatabase") nameDatabase: String): PokemonDatabase = Room.databaseBuilder(context,
        PokemonDatabase::class.java, nameDatabase).build()

    @Provides
    @Singleton
    fun getPokemonDao(db: PokemonDatabase): PokemonDao = db.getPokemonDao()


}