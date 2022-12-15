package ae.mycourse.pokemon.data.model

import com.google.gson.annotations.SerializedName

data class TypeModel(@SerializedName(value = "slot") var slot: Int,
                     @SerializedName(value = "type") var type: TypeDetailModel
)
