package ae.mycourse.pokemon.domain

import com.google.gson.annotations.SerializedName

data class VersionDetailModel(@SerializedName(value = "rarity") var rarity: Int,
                              @SerializedName(value = "version") var version: VersionModel
)
