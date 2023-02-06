package ae.mycourse.pokemon.usescases

import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.data.pokemon.entities.PokemonListEntity
import ae.mycourse.pokemon.data.pokemon.repositories.PokemonRepository
import ae.mycourse.pokemon.domain.ListPokemonsModel
import ae.mycourse.pokemon.framework.common.DialogProgressCircleBar
import android.annotation.SuppressLint
import android.app.Application
import android.app.Dialog
import android.content.Context
import kotlinx.coroutines.DelicateCoroutinesApi

class GetPokemonsListUseCase (private val pokemonRepository: PokemonRepository): DialogProgressCircleBar() {

    lateinit var mContext: Context

    @OptIn(DelicateCoroutinesApi::class)
    @SuppressLint("SuspiciousIndentation")
    suspend fun invoke(context: Context): ListPokemonsModel{
        mContext = context
        showCustomProgressDialog(context)
        val pokemonList = pokemonRepository.getListPokemon()
        customProgressDialog.cancel()
        return pokemonList
    }

    override fun getcalculatedPorcentDialog(quantity: Int): Int {
        return (quantity*100)/150
    }

    override fun getTextDialog(quantity: Int) = mContext.getString(R.string.loadingDownloadDialog)


}