package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class YellowModelResponse(@SerializedName(value = "back_default") var back_default: String,
                               @SerializedName(value = "back_gray") var back_gray: String,
                               @SerializedName(value = "back_transparent") var back_transparent: String,
                               @SerializedName(value = "front_default") var front_default: String,
                               @SerializedName(value = "front_gray") var front_gray: String,
                               @SerializedName(value = "front_transparent") var front_transparent: String)
