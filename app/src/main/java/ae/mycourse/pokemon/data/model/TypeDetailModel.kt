package ae.mycourse.pokemon.data.model

import com.google.gson.annotations.SerializedName

data class TypeDetailModel(@SerializedName(value = "name") var name: String,
                           @SerializedName(value = "url") var url: String)
