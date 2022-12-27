package ae.mycourse.pokemon.data.pokemon.datasources

import ae.mycourse.pokemon.domain.URLBaseModel
import ae.mycourse.pokemon.framework.datasources.domain.allpokemon.AllPokemonsModelResponse
import ae.mycourse.pokemon.framework.datasources.domain.detailspokemon.DetailsPokemonModelResponse
import ae.mycourse.pokemon.framework.datasources.domain.base.URLBaseResponse
import retrofit2.Response

interface PokemonApiService {

    suspend fun getListNamesPokemon(): MutableList<String>

    suspend fun getImagePokemon(id:String): String
}