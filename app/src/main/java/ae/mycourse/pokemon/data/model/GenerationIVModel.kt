package ae.mycourse.pokemon.data.model

import com.google.gson.annotations.SerializedName

data class GenerationIVModel(@SerializedName(value = "diamond-pearl") var diamond_pearl: DiamondPearlModel,
                             @SerializedName(value = "heartgold-soulsilver") var heartgold_soulsilver: HeartgoldModel,
                             @SerializedName(value = "platinum") var platinum: PlatinumModel
)
