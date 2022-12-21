package ae.mycourse.pokemon.domain

import com.google.gson.annotations.SerializedName

data class StatModel(@SerializedName(value = "base_stat") var base_stat: Int,
                     @SerializedName(value = "effort") var effort: Int,
                     @SerializedName(value = "stat") var stat: StatDetailModel
)
