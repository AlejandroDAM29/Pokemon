package ae.mycourse.pokemon.framework.datasources

import ae.mycourse.pokemon.data.pokemon.datasources.PokemonApiService
import ae.mycourse.pokemon.domain.ListPokemonsModel

class ServerPokemonDataSource(private val pokeApiRemoteService: PokeApiRemoteService): PokemonApiService {

    override suspend fun getPokemonList(): ListPokemonsModel {
        val response = pokeApiRemoteService.getListPokemon()
        val pokemonNames: MutableList<String> = mutableListOf()
        val pokemonImages: MutableList<String> = mutableListOf()
        for (result in response){
            pokemonNames.add(result.name)
            pokemonImages.add(result.url)
        }

        return ListPokemonsModel(names = pokemonNames, images = pokemonImages)
    }
}