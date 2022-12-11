package ae.mycourse.pokemon.business.aplicationservices

import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.interfacesadapter.presenter.MainActivity
import ae.mycourse.pokemon.interfacesadapter.presenter.MainScreen.MainScreen
import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.os.Build
import android.view.View
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.progressindicator.CircularProgressIndicator

class Utils(context:Context) {

    var customProgressDialog: Dialog = Dialog(context)

    fun showCustomProgressDialog(){
        customProgressDialog.setContentView(R.layout.dialog_custom_progress)
        customProgressDialog.show()
    }

    fun closeCustomProgressDialog(){
        customProgressDialog.cancel()
    }
}