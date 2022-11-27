package ae.mycourse.pokemon.business.aplicationservices.models

import com.google.gson.annotations.SerializedName

data class PokeApiDetailsModel(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String

)
