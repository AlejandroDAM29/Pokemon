package ae.mycourse.pokemon.framework.common

import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.databinding.DialogCustomProgressBinding
import ae.mycourse.pokemon.databinding.FragmentPokemonListBinding
import android.app.Application
import android.app.Dialog
import android.content.Context
import android.view.View
import android.widget.TextView
import com.google.android.material.progressindicator.CircularProgressIndicator
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.*
import javax.inject.Inject

abstract class DialogProgressCircleBar () {
    lateinit var circularProgressIndicator: CircularProgressIndicator
    lateinit var textQuantityPokemon: TextView

    lateinit var customProgressDialog: Dialog

    fun showCustomProgressDialog(context: Context){
        customProgressDialog = Dialog(context)
        customProgressDialog.setContentView(R.layout.dialog_custom_progress)
        customProgressDialog.show()
        circularProgressIndicator = customProgressDialog.findViewById(R.id.circularProgressIndicator)
        textQuantityPokemon = customProgressDialog.findViewById(R.id.textQuantityPokemon)
    }

    @DelicateCoroutinesApi
    fun setProgressCircleDialog(percentProgress: Int){
            circularProgressIndicator.setProgressCompat(getcalculatedPorcentDialog(percentProgress), true)
            textQuantityPokemon.text = getTextDialog(percentProgress)

    }

    //Here is the form to calculate total percent for every screen
    abstract fun getcalculatedPorcentDialog(quantity: Int): Int

    //The string that you can see to say user how is going the process
    abstract fun getTextDialog(quantity: Int): String
}