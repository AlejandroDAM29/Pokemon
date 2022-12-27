package ae.mycourse.pokemon.framework.datasources.domain.allpokemon

import com.google.gson.annotations.SerializedName

data class AllPokemonsModelResponse(@SerializedName(value = "count") var count: Int,
                                    @SerializedName(value = "next") var next: String,
                                    @SerializedName(value = "previous") var previous:String,
                                    @SerializedName(value = "results") var results:List<EnumerationPokemonModelResponse>
)
