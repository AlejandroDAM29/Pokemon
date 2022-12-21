package ae.mycourse.pokemon.domain

import com.google.gson.annotations.SerializedName

data class RubySaphireModel(@SerializedName(value = "back_default") var back_default: String,
                            @SerializedName(value = "back_shiny") var back_shiny: String,
                            @SerializedName(value = "front_default") var front_default: String,
                            @SerializedName(value = "front_shiny") var front_shiny: String)
