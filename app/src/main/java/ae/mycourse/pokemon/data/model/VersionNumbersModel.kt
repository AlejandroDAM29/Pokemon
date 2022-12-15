package ae.mycourse.pokemon.data.model

import com.google.gson.annotations.SerializedName

data class VersionNumbersModel(@SerializedName(value = "generation-i") var generation_i: GenerationIModel,
                               @SerializedName(value = "generation-ii") var generation_ii: GenerationIIModel,
                               @SerializedName(value = "generation-iii") var generation_iii: GenerationIIIModel,
                               @SerializedName(value = "generation-iv") var generation_iv: GenerationIVModel,
                               @SerializedName(value = "generation-v") var generation_v: GenerationVModel,
                               @SerializedName(value = "generation-vi") var generation_vi: GenerationVIModel,
                               @SerializedName(value = "generation-vii") var generation_vii: GenerationVIIModel,
                               @SerializedName(value = "generation-viii") var generation_viii: GenerationVIIIModel
)
