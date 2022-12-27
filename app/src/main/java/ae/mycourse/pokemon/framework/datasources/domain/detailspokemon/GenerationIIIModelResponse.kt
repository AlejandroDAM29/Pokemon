package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class GenerationIIIModelResponse(@SerializedName(value = "emerald") var emerald: EmeraldModelResponse,
                                      @SerializedName(value = "firered-leafgreen") var firered_leafgreen: FireredLeafgreenModelResponse,
                                      @SerializedName(value = "ruby-sapphire") var ruby_saphire: RubySaphireModelResponse
)
