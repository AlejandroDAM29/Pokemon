package ae.mycourse.pokemon.domain

import com.google.gson.annotations.SerializedName

data class IconsModel(@SerializedName(value = "front_default") var front_default: String,
                      @SerializedName(value = "front_female") var front_female: String)
