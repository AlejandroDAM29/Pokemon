package ae.mycourse.pokemon.data.customdialogs

import ae.mycourse.pokemon.R
import android.app.Dialog
import android.content.Context
import android.widget.TextView
import com.google.android.material.progressindicator.CircularProgressIndicator
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class DialogMainScreen(context:Context) {

    var customProgressDialog: Dialog = Dialog(context)
    lateinit var customCircleProgress: CircularProgressIndicator
    lateinit var textQuantityPokemon: TextView

    fun showCustomProgressDialog(){
        customProgressDialog.setContentView(R.layout.dialog_custom_progress)
        customProgressDialog.show()
        customCircleProgress = customProgressDialog.findViewById(R.id.circularProgressIndicator)
        textQuantityPokemon = customProgressDialog.findViewById(R.id.textQuantityPokemon)
    }

    fun closeCustomProgressDialog(){
        customProgressDialog.cancel()
    }

    @DelicateCoroutinesApi
    fun setProgressCircleDialog(percentProgress: Int, textDialog: String){
        val percentProgressCalculated = (percentProgress*100)/150
        GlobalScope.launch(Dispatchers.Main){
            customCircleProgress.setProgressCompat(percentProgressCalculated, true)
            textQuantityPokemon.text = textDialog
        }
    }
}