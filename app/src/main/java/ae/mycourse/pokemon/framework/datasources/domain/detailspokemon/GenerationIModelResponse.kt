package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class GenerationIModelResponse(@SerializedName(value = "red-blue") var red_blue: RedBlueModelResponse,
                                    @SerializedName(value = "yellow") var yellow: YellowModelResponse
)
