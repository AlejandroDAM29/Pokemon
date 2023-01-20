package ae.mycourse.pokemon.framework.ui.introvideo

import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.databinding.FragmentIntroVideoBinding
import ae.mycourse.pokemon.framework.ui.mainscreen.MainScreen
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit


class IntroVideo : Fragment() {

    private var _binding: FragmentIntroVideoBinding? = null
    private val binding get() = _binding!!

   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentIntroVideoBinding.inflate(inflater,container, false)
       val view = binding.root
       (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
       binding.videoViewIntro.setVideoURI(Uri.parse("android.resource://" + requireActivity().packageName +"/"+ R.raw.intro_pokemon))
       binding.videoViewIntro.requestFocus()
       binding.videoViewIntro.setOnPreparedListener{it.start()}
       view.setOnClickListener {nextFragment()}
       binding.videoViewIntro.setOnCompletionListener {nextFragment()}
       return view
    }

    private fun nextFragment(){
        parentFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.fragmentContainer, MainScreen())
        }
    }


}