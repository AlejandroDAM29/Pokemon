package ae.mycourse.pokemon.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.R
import android.widget.TextView

class FragmentError : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_error, container, false)
        val textError : TextView = view.findViewById(R.id.text_error)
        val args = this.arguments
        val inputData = args?.get("fragmentData")
        textError.text = inputData.toString()
        return view
    }
}