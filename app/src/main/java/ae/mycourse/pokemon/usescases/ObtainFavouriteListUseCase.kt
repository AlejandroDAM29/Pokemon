package ae.mycourse.pokemon.usescases

import ae.mycourse.pokemon.data.pokemon.databases.entities.FavouriteList
import ae.mycourse.pokemon.data.pokemon.repositories.PokemonRepository
import androidx.lifecycle.LiveData

class ObtainFavouriteListUseCase (private val pokemonRepository: PokemonRepository){
    fun invoke(): LiveData<MutableList<FavouriteList>> {
        return pokemonRepository.getFavouritePokemons()
    }
}