package ae.mycourse.pokemon.business.modelservices

import com.google.gson.annotations.SerializedName

data class MovesModel(@SerializedName(value = "move") var move: MoveModel,
                      @SerializedName(value = "version_group_details") var version_group_details: List<VersionGroupDetailModel>)
