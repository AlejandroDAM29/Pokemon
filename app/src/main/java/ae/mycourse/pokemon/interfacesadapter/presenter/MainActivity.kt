package ae.mycourse.pokemon.interfacesadapter.presenter

import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.interfacesadapter.presenter.MainScreen.MainScreen
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,
                MainScreen()).addToBackStack(null).commit();

        }
    }
}