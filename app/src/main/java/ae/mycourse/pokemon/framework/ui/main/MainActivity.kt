package ae.mycourse.pokemon.framework.ui.main

import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.framework.common.longToast
import ae.mycourse.pokemon.framework.common.shorToast
import ae.mycourse.pokemon.framework.ui.mainscreen.MainScreen
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.add
import androidx.fragment.app.commit
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val screenSplash: SplashScreen = installSplashScreen()

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screenSplash.setKeepOnScreenCondition{false}

        if(savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<MainScreen>(R.id.fragmentContainer)
            }

        }
    }
}