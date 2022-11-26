package ae.mycourse.pokemon.interfacesadapter.presenter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.R
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentError.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentError : Fragment() {

    var datos: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

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