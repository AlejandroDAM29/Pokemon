package ae.mycourse.pokemon.framework.ui.main

import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.framework.ui.mainscreen.MainScreen
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<MainScreen>(R.id.fragmentContainer)

            }

        }
    }
}