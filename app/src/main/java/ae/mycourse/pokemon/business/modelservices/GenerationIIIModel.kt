package ae.mycourse.pokemon.business.modelservices

import com.google.gson.annotations.SerializedName

data class GenerationIIIModel(@SerializedName(value = "emerald") var emerald: EmeraldModel,
                              @SerializedName(value = "firered-leafgreen") var firered_leafgreen: FireredLeafgreenModel,
                              @SerializedName(value = "ruby-sapphire") var ruby_saphire: RubySaphireModel)
