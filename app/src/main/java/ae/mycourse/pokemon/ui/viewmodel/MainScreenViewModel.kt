package ae.mycourse.pokemon.ui.viewmodel

import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.data.providerClasses.PokemonProvider
import ae.mycourse.pokemon.domain.GetPokemonListUseCase
import ae.mycourse.pokemon.ui.view.PokemonList
import android.content.Context
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainScreenViewModel : ViewModel() {

    fun getPokemonList(mContext: Context){
        var getPokemonListUseCase = GetPokemonListUseCase(mContext)
        Log.i("Mensaje1","Entro en la clase de caso de viewModel")
         viewModelScope.launch {
             Log.i("Mensaje2","Entro en el launch de la clase de viewModel")
             getPokemonListUseCase()}
     }


}