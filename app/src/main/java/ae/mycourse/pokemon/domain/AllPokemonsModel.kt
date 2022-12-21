package ae.mycourse.pokemon.domain

import com.google.gson.annotations.SerializedName

data class AllPokemonsModel(@SerializedName(value = "count") var count: Int,
                            @SerializedName(value = "next") var next: String,
                            @SerializedName(value = "previous") var previous:String,
                            @SerializedName(value = "results") var results:List<EnumerationPokemon>
)
