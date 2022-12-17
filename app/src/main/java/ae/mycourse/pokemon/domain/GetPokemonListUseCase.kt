package ae.mycourse.pokemon.domain

import ae.mycourse.pokemon.data.PokemonRepository
import ae.mycourse.pokemon.data.providerClasses.PokemonProvider
import android.content.Context

class GetPokemonListUseCase(requireContext: Context) {
    private val repository = PokemonRepository()
    private val mContext = requireContext
    suspend operator fun invoke() = repository.getPokemonList(mContext)
}