package ae.mycourse.pokemon.data.model

import com.google.gson.annotations.SerializedName

data class GenerationVIIModel(@SerializedName(value = "icons") var icons: IconsModel,
                              @SerializedName(value = "ultra-sun-ultra-moon") var ultra_sun_ultra_moon: UltraModel
)
