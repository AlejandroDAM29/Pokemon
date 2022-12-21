package ae.mycourse.pokemon.domain

import com.google.gson.annotations.SerializedName

data class MovedLearnMethodModel(@SerializedName(value = "name") var name: String,
                                 @SerializedName(value = "url") var url: String)
