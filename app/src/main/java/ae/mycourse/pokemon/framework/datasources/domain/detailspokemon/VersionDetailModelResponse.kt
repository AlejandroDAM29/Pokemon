package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class VersionDetailModelResponse(@SerializedName(value = "rarity") var rarity: Int,
                                      @SerializedName(value = "version") var version: VersionModelResponse
)
