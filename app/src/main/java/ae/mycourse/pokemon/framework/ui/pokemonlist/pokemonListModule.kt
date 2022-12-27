package ae.mycourse.pokemon.framework.ui.pokemonlist

import ae.mycourse.pokemon.data.pokemon.repositories.PokemonRepository
import ae.mycourse.pokemon.framework.common.DialogProgressCircleBar
import ae.mycourse.pokemon.usescases.GetPokemonsListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class pokemonListModule {

    @Provides
    fun getPokemonListUseCaseProvider(pokemonRepository: PokemonRepository, progressDialog: DialogProgressCircleBar): GetPokemonsListUseCase {
        return GetPokemonsListUseCase(pokemonRepository, progressDialog)
    }

}