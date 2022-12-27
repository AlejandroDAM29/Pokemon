package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class GenerationIIModelResponse(@SerializedName(value = "crystal") var crystal: CrystalModelResponse,
                                     @SerializedName(value = "gold") var gold: GoldModelResponse,
                                     @SerializedName(value = "silver") var silver: SilverModelResponse
)
