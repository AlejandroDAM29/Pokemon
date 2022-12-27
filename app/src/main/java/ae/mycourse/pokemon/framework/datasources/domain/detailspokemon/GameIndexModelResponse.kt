package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class GameIndexModelResponse(@SerializedName(value = "game_index") var game_index: Int,
                                  @SerializedName(value = "version") var version: VersionModelResponse
)
