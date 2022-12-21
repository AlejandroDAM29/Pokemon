package ae.mycourse.pokemon.domain

import com.google.gson.annotations.SerializedName

data class GenerationIIModel(@SerializedName(value = "crystal") var crystal: CrystalModel,
                             @SerializedName(value = "gold") var gold: GoldModel,
                             @SerializedName(value = "silver") var silver: SilverModel
)
