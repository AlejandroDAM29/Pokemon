package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class StatModelResponse(@SerializedName(value = "base_stat") var base_stat: Int,
                             @SerializedName(value = "effort") var effort: Int,
                             @SerializedName(value = "stat") var stat: StatDetailModelResponse
)
