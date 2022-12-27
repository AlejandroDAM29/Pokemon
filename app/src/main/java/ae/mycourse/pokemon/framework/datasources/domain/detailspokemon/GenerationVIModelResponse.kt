package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class GenerationVIModelResponse(@SerializedName(value = "omegaruby-alphasapphire") var omegaruby: OmegaRubyModelResponse,
                                     @SerializedName(value = "x-y") var xy: XyModelResponse
)
