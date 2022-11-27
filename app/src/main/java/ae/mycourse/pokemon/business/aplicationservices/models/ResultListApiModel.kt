package ae.mycourse.pokemon.business.aplicationservices.models

import com.google.gson.annotations.SerializedName

data class ResultListApiModel(
    @SerializedName("results") val pokemons: List<PokeApiDetailsModel>
)
