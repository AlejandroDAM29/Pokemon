package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class VersionNumbersModelResponse(@SerializedName(value = "generation-i") var generation_i: GenerationIModelResponse,
                                       @SerializedName(value = "generation-ii") var generation_ii: GenerationIIModelResponse,
                                       @SerializedName(value = "generation-iii") var generation_iii: GenerationIIIModelResponse,
                                       @SerializedName(value = "generation-iv") var generation_iv: GenerationIVModelResponse,
                                       @SerializedName(value = "generation-v") var generation_v: GenerationVModelResponse,
                                       @SerializedName(value = "generation-vi") var generation_vi: GenerationVIModelResponse,
                                       @SerializedName(value = "generation-vii") var generation_vii: GenerationVIIModelResponse,
                                       @SerializedName(value = "generation-viii") var generation_viii: GenerationVIIIModelResponse
)
