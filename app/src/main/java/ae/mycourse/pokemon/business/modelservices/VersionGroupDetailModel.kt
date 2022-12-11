package ae.mycourse.pokemon.business.modelservices

import com.google.gson.annotations.SerializedName

data class VersionGroupDetailModel(@SerializedName(value = "level_learned_at") var level_learned_at: Int,
                                   @SerializedName(value = "move_learn_method") var move_learn_method: MovedLearnMethodModel,
                                   @SerializedName(value = "version_group")var version_group: VersionGroupModel)
