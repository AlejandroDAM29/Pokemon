package ae.mycourse.pokemon.business.modelservices

import com.google.gson.annotations.SerializedName

data class GenerationVIModel(@SerializedName(value = "omegaruby-alphasapphire") var omegaruby: OmegaRubyModel,
                             @SerializedName(value = "x-y") var xy: XyModel)
