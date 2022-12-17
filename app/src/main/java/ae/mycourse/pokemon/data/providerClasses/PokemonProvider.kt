package ae.mycourse.pokemon.data.providerClasses

import ae.mycourse.pokemon.data.model.AllPokemonsModel
import ae.mycourse.pokemon.data.model.DetailsPokemonModel
import ae.mycourse.pokemon.data.model.PokemonProviderModel

class PokemonProvider {
    companion object {
        var pokemonList: PokemonProviderModel? = PokemonProviderModel(ArrayList(), ArrayList())
        }

}