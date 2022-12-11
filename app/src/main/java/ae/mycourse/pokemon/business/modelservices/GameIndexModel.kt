package ae.mycourse.pokemon.business.modelservices

import com.google.gson.annotations.SerializedName

data class GameIndexModel(@SerializedName(value = "game_index") var game_index: Int,
                          @SerializedName(value = "version") var version: VersionModel)
