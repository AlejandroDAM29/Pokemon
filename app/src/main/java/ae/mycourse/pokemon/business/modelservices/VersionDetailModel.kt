package ae.mycourse.pokemon.business.modelservices

import com.google.gson.annotations.SerializedName

data class VersionDetailModel(@SerializedName(value = "rarity") var rarity: Int,
                              @SerializedName(value = "version") var version: VersionModel)
