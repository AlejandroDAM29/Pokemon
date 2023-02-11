package ae.mycourse.pokemon.framework.common

import ae.mycourse.pokemon.R
import android.app.Dialog
import android.content.Context
import android.widget.TextView
import com.google.android.material.progressindicator.CircularProgressIndicator
import kotlinx.coroutines.*

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