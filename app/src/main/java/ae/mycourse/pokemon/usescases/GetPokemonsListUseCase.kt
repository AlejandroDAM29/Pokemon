package ae.mycourse.pokemon.usescases

import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.data.pokemon.repositories.PokemonRepository
import ae.mycourse.pokemon.domain.ListPokemonsModel
import ae.mycourse.pokemon.framework.common.DialogProgressCircleBar
import android.annotation.SuppressLint
import android.app.Application
import android.app.Dialog
import android.content.Context
import kotlinx.coroutines.DelicateCoroutinesApi

class GetPokemonsListUseCase (private val pokemonRepository: PokemonRepository) {

    lateinit var mContext: Context

    @OptIn(DelicateCoroutinesApi::class)
    @SuppressLint("SuspiciousIndentation")
    suspend fun invoke(context: Context): ListPokemonsModel{
        mContext = context
        val pokemonList = pokemonRepository.getListPokemon()
        return pokemonList
    }


}