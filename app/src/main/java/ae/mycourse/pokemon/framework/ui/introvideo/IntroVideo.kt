package ae.mycourse.pokemon.framework.ui.introvideo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.databinding.FragmentIntroVideoBinding
import ae.mycourse.pokemon.framework.ui.mainscreen.MainScreen
import android.media.session.MediaController
import android.media.session.MediaSession
import android.net.Uri
import android.provider.MediaStore.Images.Media
import android.util.Log
import androidx.fragment.app.commit

class IntroVideo : Fragment() {

    private var _binding: FragmentIntroVideoBinding? = null
    private val binding get() = _binding!!
    private var mediaControls: MediaController? = null

   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentIntroVideoBinding.inflate(inflater,container, false)
       val view = binding.root

       binding.videoViewIntro.setVideoURI(Uri.parse("android.resource://" +
               requireActivity().packageName +"/"+
               R.raw.intro_pokemon))
       binding.videoViewIntro.requestFocus()
       binding.videoViewIntro.setOnPreparedListener {
           binding.videoViewIntro.start()
       }
       binding.videoViewIntro.setOnClickListener {nextFragment()}
       binding.videoViewIntro.setOnCompletionListener {nextFragment()}

       return view
    }

    private fun nextFragment(){
        parentFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.fragmentContainer, MainScreen())
            addToBackStack("mainStackFragments")
        }
    }


}