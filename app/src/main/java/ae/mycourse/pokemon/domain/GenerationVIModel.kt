package ae.mycourse.pokemon.domain

import com.google.gson.annotations.SerializedName

data class GenerationVIModel(@SerializedName(value = "omegaruby-alphasapphire") var omegaruby: OmegaRubyModel,
                             @SerializedName(value = "x-y") var xy: XyModel
)
