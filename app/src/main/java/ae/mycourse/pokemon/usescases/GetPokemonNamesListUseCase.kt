package ae.mycourse.pokemon.usescases

import ae.mycourse.pokemon.data.pokemon.repositories.PokemonRepository
import ae.mycourse.pokemon.domain.AllPokemonsModel
import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class GetPokemonNamesListUseCase(private val pokemonRepository: PokemonRepository) {

    suspend fun invoke(): Response<AllPokemonsModel> = withContext(Dispatchers.IO){
        pokemonRepository.getListPokemon()
    }
}