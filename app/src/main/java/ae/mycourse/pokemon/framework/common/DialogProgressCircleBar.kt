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

class DialogProgressCircleBar () {
    lateinit var circularProgressIndicator: CircularProgressIndicator
    lateinit var textPokemon: TextView
    lateinit var customProgressDialog: Dialog

    fun showCustomProgressDialog(context: Context, idText: Int){
        customProgressDialog = Dialog(context)
        customProgressDialog.setContentView(R.layout.dialog_custom_progress)
        customProgressDialog.show()
        circularProgressIndicator = customProgressDialog.findViewById(R.id.circularProgressIndicator)
        textPokemon = customProgressDialog.findViewById(R.id.textPokemon)
        circularProgressIndicator.isIndeterminate = true
        textPokemon.text = context.getString(idText)
    }

    @DelicateCoroutinesApi
    fun setProgressCircleDialog(percentProgress: Int=0){
        if (percentProgress == 0) {
            circularProgressIndicator.isIndeterminate = false
            circularProgressIndicator.setProgressCompat(getcalculatedPorcentDialog(percentProgress), true)
        }
    }

    //Here is the form to calculate total percent for every screen
    fun getcalculatedPorcentDialog(quantity: Int): Int{
        return 0
    }
}