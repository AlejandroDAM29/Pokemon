package ae.mycourse.pokemon.business.modelservices

import com.google.gson.annotations.SerializedName

data class DreamWorldModel(@SerializedName(value = "front_default") var front_default: String,
                           @SerializedName(value = "front_female") var front_female: String)
