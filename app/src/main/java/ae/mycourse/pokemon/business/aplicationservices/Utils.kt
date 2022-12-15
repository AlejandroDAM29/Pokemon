package ae.mycourse.pokemon.business.aplicationservices

import ae.mycourse.pokemon.R
import android.app.Dialog
import android.content.Context
import android.widget.TextView
import com.google.android.material.progressindicator.CircularProgressIndicator
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Utils(context:Context) {

    var customProgressDialog: Dialog = Dialog(context)
    //Esto iría adaptado a la vista que lo controla QUIZÁS
    lateinit var customCircleProgress: CircularProgressIndicator
    lateinit var textQuantityPokemon: TextView

    fun showCustomProgressDialog(){
        //Constructor
        customProgressDialog.setContentView(R.layout.dialog_custom_progress)
        //Proceso de mostrar
        customProgressDialog.show()
        //TODO Dividir la funcionalidad de la contrucción del Dialog con los procesos de cambio
        //Estos dos irían en la UI principal quizás en otra VIEW aparte que los controle. Habría que crear la UI
        customCircleProgress = customProgressDialog.findViewById(R.id.circularProgressIndicator)
        textQuantityPokemon = customProgressDialog.findViewById(R.id.textQuantityPokemon)
    }

    fun closeCustomProgressDialog(){
        //Proceso de cancelar
        customProgressDialog.cancel()
    }

    @DelicateCoroutinesApi
    fun setProgressCircleDialog(percentProgress: Int, textDialog: String){
        //Calculate percent of circle progress dialog
        val percentProgressCalculated = (percentProgress*100)/150
        GlobalScope.launch(Dispatchers.Main){
            customCircleProgress.setProgressCompat(percentProgressCalculated, true)
            textQuantityPokemon.text = textDialog
        }
    }
}