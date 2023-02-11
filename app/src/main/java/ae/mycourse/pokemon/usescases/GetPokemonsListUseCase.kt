package ae.mycourse.pokemon.usescases

import ae.mycourse.pokemon.data.pokemon.repositories.PokemonRepository
import ae.mycourse.pokemon.domain.ListPokemonsModel
import android.annotation.SuppressLint
import android.content.Context

class GetPokemonsListUseCase (private val pokemonRepository: PokemonRepository) {

    lateinit var mContext: Context

    @SuppressLint("SuspiciousIndentation")
    suspend fun invoke(context: Context): ListPokemonsModel{
        mContext = context
        val pokemonList = pokemonRepository.getListPokemon()
        return pokemonList
    }


}