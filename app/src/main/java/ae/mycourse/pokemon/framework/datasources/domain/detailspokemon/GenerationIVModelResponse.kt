package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class GenerationIVModelResponse(@SerializedName(value = "diamond-pearl") var diamond_pearl: DiamondPearlModelResponse,
                                     @SerializedName(value = "heartgold-soulsilver") var heartgold_soulsilver: HeartgoldModelResponse,
                                     @SerializedName(value = "platinum") var platinum: PlatinumModelResponse
)
