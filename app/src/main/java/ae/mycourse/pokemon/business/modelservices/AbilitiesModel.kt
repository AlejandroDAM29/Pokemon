package ae.mycourse.pokemon.business.modelservices

import com.google.gson.annotations.SerializedName

data class AbilitiesModel(@SerializedName(value = "ability") var ability: AbilityModel,
                          @SerializedName(value = "is_hidden") var is_hidden: Boolean,
                          @SerializedName(value = "slot") var slot: Int)
