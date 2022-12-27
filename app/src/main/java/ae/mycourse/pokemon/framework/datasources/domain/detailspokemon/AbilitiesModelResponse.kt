package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class AbilitiesModelResponse(@SerializedName(value = "ability") var ability: AbilityModelResponse,
                                  @SerializedName(value = "is_hidden") var is_hidden: Boolean,
                                  @SerializedName(value = "slot") var slot: Int)
