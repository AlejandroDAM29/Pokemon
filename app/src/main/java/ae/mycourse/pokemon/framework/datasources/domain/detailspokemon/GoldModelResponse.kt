package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class GoldModelResponse(@SerializedName(value = "back_default") var back_default: String,
                             @SerializedName(value = "back_shiny") var back_shiny: String,
                             @SerializedName(value = "front_default") var front_default: String,
                             @SerializedName(value = "front_shiny") var front_shiny: String,
                             @SerializedName(value = "front_transparent") var front_transparent: String)
