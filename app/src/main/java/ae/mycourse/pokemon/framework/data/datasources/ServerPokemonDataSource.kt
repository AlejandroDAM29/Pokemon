package ae.mycourse.pokemon.framework.data.datasources

import ae.mycourse.pokemon.data.pokemon.datasources.PokemonApiClient
import ae.mycourse.pokemon.domain.AllPokemonsModel
import ae.mycourse.pokemon.domain.DetailsPokemonModel
import ae.mycourse.pokemon.domain.URLBaseResponse
import retrofit2.Response

class ServerPokemonDataSource: PokemonApiClient {
    override suspend fun getURLBaseContent(): Response<URLBaseResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun getListPokemon(): Response<AllPokemonsModel> {
        TODO("Not yet implemented")
    }

    override suspend fun getDetailsPokemon(id: String): Response<DetailsPokemonModel> {
        TODO("Not yet implemented")
    }
    //Esto va a ser una fuente de datos que se va a conectar al servidor
}