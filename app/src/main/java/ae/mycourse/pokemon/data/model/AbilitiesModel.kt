package ae.mycourse.pokemon.data.model

import com.google.gson.annotations.SerializedName

data class AbilitiesModel(@SerializedName(value = "ability") var ability: AbilityModel,
                          @SerializedName(value = "is_hidden") var is_hidden: Boolean,
                          @SerializedName(value = "slot") var slot: Int)
