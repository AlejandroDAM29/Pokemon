package ae.mycourse.pokemon.usescases

import ae.mycourse.pokemon.data.pokemon.repositories.PokemonRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class UsesCasesModule {

    @Provides
    fun filterListUseCaseProvider(): FilterListUseCase =
        FilterListUseCase()

    @Provides
    fun obtainFavouriteListUseCaseProvider(pokemonRepository: PokemonRepository): ObtainFavouriteListUseCase =
        ObtainFavouriteListUseCase(pokemonRepository)

}