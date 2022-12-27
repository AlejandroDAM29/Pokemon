package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class EmeraldModelResponse(@SerializedName(value = "front_default") var front_default: String,
                                @SerializedName(value = "front_shiny") var front_shiny: String)
