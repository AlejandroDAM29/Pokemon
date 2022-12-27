package ae.mycourse.pokemon.framework.datasources.domain.allpokemon

import com.google.gson.annotations.SerializedName

data class EnumerationPokemonModelResponse(@SerializedName(value = "name") var name: String,
                                           @SerializedName(value = "url") var url: String)
