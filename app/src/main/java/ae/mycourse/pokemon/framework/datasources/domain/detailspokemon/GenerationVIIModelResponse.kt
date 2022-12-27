package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class GenerationVIIModelResponse(@SerializedName(value = "icons") var icons: IconsModelResponse,
                                      @SerializedName(value = "ultra-sun-ultra-moon") var ultra_sun_ultra_moon: UltraModelResponse
)
