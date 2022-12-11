package ae.mycourse.pokemon.business.modelservices

import com.google.gson.annotations.SerializedName

data class GoldModel(@SerializedName(value = "back_default") var back_default: String,
                     @SerializedName(value = "back_shiny") var back_shiny: String,
                     @SerializedName(value = "front_default") var front_default: String,
                     @SerializedName(value = "front_shiny") var front_shiny: String,
                     @SerializedName(value = "front_transparent") var front_transparent: String)
