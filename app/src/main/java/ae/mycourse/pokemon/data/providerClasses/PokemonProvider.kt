package ae.mycourse.pokemon.data.providerClasses

import ae.mycourse.pokemon.data.model.AllPokemonsModel
import ae.mycourse.pokemon.data.model.DetailsPokemonModel

class PokemonProvider {
    companion object {
        lateinit var pokemonNames: AllPokemonsModel
        lateinit var pokemonDetails: DetailsPokemonModel
    }
}