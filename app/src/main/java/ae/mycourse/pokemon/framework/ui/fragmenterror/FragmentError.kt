package ae.mycourse.pokemon.framework.ui.fragmenterror

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.databinding.FragmentErrorBinding
import ae.mycourse.pokemon.databinding.FragmentMainScreenBinding
import android.widget.TextView

class FragmentError : Fragment() {
    private var _binding: FragmentErrorBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentErrorBinding.inflate(inflater, container, false)
        val view = binding.root
        val textError : TextView = view.findViewById(R.id.text_error)
        val args = this.arguments
        val inputData = args?.get("fragmentData")
        textError.text = inputData.toString()
        return view
    }
}