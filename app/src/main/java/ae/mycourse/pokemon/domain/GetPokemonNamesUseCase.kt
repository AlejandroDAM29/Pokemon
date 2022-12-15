package ae.mycourse.pokemon.domain

import ae.mycourse.pokemon.data.PokemonRepository
import ae.mycourse.pokemon.data.model.AllPokemonsModel

class GetPokemonNamesUseCase {
    private val repository = PokemonRepository()

    suspend operator fun invoke(): AllPokemonsModel? = repository.getPokemonNames()
}