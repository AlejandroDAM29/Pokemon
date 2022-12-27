package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class GenerationVModelResponse(@SerializedName(value = "black-white") var black_white: BlackWhiteModelResponse)
