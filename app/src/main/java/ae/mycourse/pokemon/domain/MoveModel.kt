package ae.mycourse.pokemon.domain

import com.google.gson.annotations.SerializedName

data class MoveModel(@SerializedName(value = "name") var name:String,
                     @SerializedName(value = "uri") var url: String)
