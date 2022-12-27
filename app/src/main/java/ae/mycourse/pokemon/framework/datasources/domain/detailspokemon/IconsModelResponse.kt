package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class IconsModelResponse(@SerializedName(value = "front_default") var front_default: String,
                              @SerializedName(value = "front_female") var front_female: String)
