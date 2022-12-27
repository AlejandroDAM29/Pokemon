package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class TypeModelResponse(@SerializedName(value = "slot") var slot: Int,
                             @SerializedName(value = "type") var type: TypeDetailModelResponse
)
