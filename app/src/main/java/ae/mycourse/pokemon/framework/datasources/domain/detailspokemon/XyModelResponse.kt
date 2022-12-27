package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class XyModelResponse(@SerializedName(value = "front_default") var front_default: String,
                           @SerializedName(value = "front_female") var front_female: String,
                           @SerializedName(value = "front_shiny") var front_shiny: String,
                           @SerializedName(value = "front_shiny_female") var front_shiny_female: String)
