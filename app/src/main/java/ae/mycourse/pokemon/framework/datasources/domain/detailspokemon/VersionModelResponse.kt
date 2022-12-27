package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class VersionModelResponse(@SerializedName(value = "name") var name: String,
                                @SerializedName(value = "url") var url: String)
