package ae.mycourse.pokemon.framework.ui.pokemondetails

import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.databinding.FragmentPokemonDetailsBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.smarteist.autoimageslider.SliderView


class PokemonDetails : Fragment() {
    private lateinit var imageUrl: ArrayList<String>
    private lateinit var sliderView: SliderView
    private lateinit var sliderAdapter: SliderAdapter
    private var _binding: FragmentPokemonDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding =  FragmentPokemonDetailsBinding.inflate(inflater, container, false)
        val view = binding.root
        sliderView = view.findViewById(R.id.slider)
        imageUrl = ArrayList()
        imageUrl =
            (imageUrl + "https://s1.eestatic.com/2021/07/12/deportes/futbol/595952248_195032433_1706x960.jpg") as ArrayList<String>
        imageUrl =
            (imageUrl + "https://s1.eestatic.com/2021/07/12/deportes/futbol/595952248_195032433_1706x960.jpg") as ArrayList<String>
        imageUrl =
            (imageUrl + "https://practice.geeksforgeeks.org/_next/image?url=https%3A%2F%2Fmedia.geeksforgeeks.org%2Fimg-practice%2Fbanner%2Ffull-stack-node-thumbnail.png&w=1920&q=75") as ArrayList<String>
        sliderAdapter = SliderAdapter( imageUrl)
        sliderView.setSliderAdapter(sliderAdapter)


        return view
    }
}