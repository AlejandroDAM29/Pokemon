package ae.mycourse.pokemon.interfacesadapter.presenter.MainScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.R
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainScreen.newInstance] factory method to
 * create an instance of this fragment.
 */


class MainScreen : Fragment() {

    lateinit var buttonPokedex: Button
    lateinit var buttonFavourites: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view  = inflater.inflate(R.layout.fragment_main_screen, container, false)
        buttonPokedex = view.findViewById(R.id.buttonPokedex)
        buttonFavourites = view.findViewById(R.id.buttonFavorourites)
        //Buttons listeners
        buttonPokedex.setOnClickListener{
            var bundlePokedex = Bundle()
            bundlePokedex.putString("fragmentData", "Sorry your pokemon don't have internet")
        }
        return view
    }
}