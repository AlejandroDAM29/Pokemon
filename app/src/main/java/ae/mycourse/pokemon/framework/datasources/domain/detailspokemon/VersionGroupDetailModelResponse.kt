package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class VersionGroupDetailModelResponse(@SerializedName(value = "level_learned_at") var level_learned_at: Int,
                                           @SerializedName(value = "move_learn_method") var move_learn_method: MovedLearnMethodModelResponse,
                                           @SerializedName(value = "version_group")var version_group: VersionGroupModelResponse
)
