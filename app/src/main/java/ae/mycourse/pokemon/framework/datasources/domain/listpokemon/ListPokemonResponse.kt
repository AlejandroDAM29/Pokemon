package ae.mycourse.pokemon.framework.datasources.domain.listpokemon

import com.google.gson.annotations.SerializedName

data class ListPokemonResponse(@SerializedName(value = "name") var name: String,
                               @SerializedName(value = "url") var url: String)
