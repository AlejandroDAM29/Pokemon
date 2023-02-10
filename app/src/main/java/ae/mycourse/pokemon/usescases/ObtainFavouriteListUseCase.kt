package ae.mycourse.pokemon.usescases

import ae.mycourse.pokemon.data.pokemon.databases.entities.FavouriteList
import ae.mycourse.pokemon.data.pokemon.repositories.PokemonRepository
import android.util.Log
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

class ObtainFavouriteListUseCase (private val pokemonRepository: PokemonRepository){
    fun invoke(): LiveData<MutableList<FavouriteList>> {
        return pokemonRepository.getFavouritePokemons()
    }
}