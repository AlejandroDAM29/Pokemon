package ae.mycourse.pokemon.usescases

import ae.mycourse.pokemon.data.pokemon.databases.entities.FavouriteList
import ae.mycourse.pokemon.data.pokemon.repositories.PokemonRepository

class ObtainFavouriteListUseCase (private val pokemonRepository: PokemonRepository){
    suspend fun invoke(): MutableList<String> {
        val pokemonList: MutableList<String> = mutableListOf()
        pokemonRepository.getFavouritePokemons().map {
            pokemonList.add(it.name)
        }
        return pokemonList
    }
}