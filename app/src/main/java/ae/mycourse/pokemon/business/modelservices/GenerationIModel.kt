package ae.mycourse.pokemon.business.modelservices

import com.google.gson.annotations.SerializedName

data class GenerationIModel(@SerializedName(value = "red-blue") var red_blue: RedBlueModel,
                            @SerializedName(value = "yellow") var yellow: YellowModel)
