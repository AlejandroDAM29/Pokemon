package ae.mycourse.pokemon.data.providerClasses

import ae.mycourse.pokemon.domain.PokemonProviderModel

class PokemonProvider {
    companion object {
        var pokemonList: PokemonProviderModel? = PokemonProviderModel(ArrayList(), ArrayList())
        }

}