package ae.mycourse.pokemon.business.modelservices

import com.google.gson.annotations.SerializedName

data class GenerationVModel(@SerializedName(value = "black-white") var black_white: BlackWhiteModel)
