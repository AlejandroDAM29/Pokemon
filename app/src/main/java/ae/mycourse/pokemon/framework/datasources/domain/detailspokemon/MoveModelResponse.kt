package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class MoveModelResponse(@SerializedName(value = "name") var name:String,
                             @SerializedName(value = "uri") var url: String)
