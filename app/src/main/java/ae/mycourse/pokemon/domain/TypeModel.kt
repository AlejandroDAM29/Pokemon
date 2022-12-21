package ae.mycourse.pokemon.domain

import com.google.gson.annotations.SerializedName

data class TypeModel(@SerializedName(value = "slot") var slot: Int,
                     @SerializedName(value = "type") var type: TypeDetailModel
)
