package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class MovesModelResponse(@SerializedName(value = "move") var move: MoveModelResponse,
                              @SerializedName(value = "version_group_details") var version_group_details: List<VersionGroupDetailModelResponse>)
