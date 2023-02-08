package ae.mycourse.pokemon.framework.common

import android.app.Activity
import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import com.squareup.picasso.Picasso
import dagger.hilt.android.qualifiers.ApplicationContext

//Obtain color
fun Activity.color(@ColorRes color: Int) = ContextCompat.getColor(this, color)

//Check if anything is null
fun Any?.isNull() = this == null

//Create long toast
fun Activity.longToast(text: String){
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}

//Create short toast
fun Activity.shorToast(text: String){
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}

//Convert image using Picasso
fun ImageView.picassoConvert(url: String?){
    if (url != null) {
        if (url.isNotEmpty()){
            Picasso.get().load(url).into(this)
        }
    }
}

//Manage listener of event when you are writing
fun EditText.onTextChanged(listener:(String) -> Unit){
    this.addTextChangedListener(object: TextWatcher{
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

        override fun afterTextChanged(p0: Editable?) {
            //Return the value of text after write all chain
            listener(p0.toString())
        }
    })
}