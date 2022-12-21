package ae.mycourse.pokemon.domain

import com.google.gson.annotations.SerializedName

data class EmeraldModel(@SerializedName(value = "front_default") var front_default: String,
                        @SerializedName(value = "front_shiny") var front_shiny: String)
