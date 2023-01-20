package ae.mycourse.pokemon.data

import ae.mycourse.pokemon.data.pokemon.datasources.PokemonApiService
import ae.mycourse.pokemon.data.pokemon.datasources.PokemonDao
import ae.mycourse.pokemon.data.pokemon.repositories.PokemonRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    fun pokemonRepositoryProvider(pokemonApiService: PokemonApiService, pokemonDao: PokemonDao): PokemonRepository{
        return PokemonRepository(pokemonApiService, pokemonDao)
    }


}