package ae.mycourse.pokemon.data

import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.data.customdialogs.DialogMainScreen
import ae.mycourse.pokemon.data.model.AllPokemonsModel
import ae.mycourse.pokemon.data.model.DetailsPokemonModel
import ae.mycourse.pokemon.data.model.PokemonProviderModel
import ae.mycourse.pokemon.data.network.PokemonService
import ae.mycourse.pokemon.data.providerClasses.PokemonProvider
import ae.mycourse.pokemon.ui.view.FragmentError
import ae.mycourse.pokemon.ui.view.MainScreen
import ae.mycourse.pokemon.ui.view.PokemonList
import android.content.Context
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.DelicateCoroutinesApi

class PokemonRepository : AppCompatActivity(){
    val api = PokemonService()

    @DelicateCoroutinesApi
    suspend fun getPokemonList(context: Context) {
        Log.i("Mensaje3","Entroooooo")
        val dialogMainScreen = DialogMainScreen(context)
        dialogMainScreen.showCustomProgressDialog()
        val responseApiResults = api.getPokemonNames()
        if (responseApiResults != null) {
            for (result in responseApiResults.results){
                var responseApiDetails = api.getPokemonDetails(result.name)
                PokemonProvider.pokemonList!!.pokemonNames.add(result.name)
                if (responseApiDetails != null){
                    PokemonProvider.pokemonList!!.pokemonImages.add(responseApiDetails.sprites.front_default)
                    dialogMainScreen.setProgressCircleDialog(PokemonProvider.pokemonList!!.pokemonNames.size, context.getString(
                        R.string.loadingDownloadDialog) + " "+PokemonProvider.pokemonList!!.pokemonNames.size+ " " + context.getString(R.string.loadingDownloadDialog2))
                }
            }
        }
        dialogMainScreen.closeCustomProgressDialog()
    }
}