package ae.mycourse.pokemon.usescases

import ae.mycourse.pokemon.data.pokemon.repositories.PokemonRepository
import ae.mycourse.pokemon.domain.AllPokemonsModel
import ae.mycourse.pokemon.domain.DetailsPokemonModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class GetPokemonImagesListUseCase(private val pokemonRepository: PokemonRepository) {
    suspend fun invoke(name: String): Response<DetailsPokemonModel> = withContext(Dispatchers.IO){
        pokemonRepository.getDetailsPokemon(name)
    }
}