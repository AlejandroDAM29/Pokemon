package ae.mycourse.pokemon.data.model

import com.google.gson.annotations.SerializedName

data class DreamWorldModel(@SerializedName(value = "front_default") var front_default: String,
                           @SerializedName(value = "front_female") var front_female: String)
