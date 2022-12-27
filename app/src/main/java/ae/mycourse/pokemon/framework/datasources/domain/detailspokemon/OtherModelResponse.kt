package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class OtherModelResponse(@SerializedName(value = "dream_world") var dream_world: DreamWorldModelResponse,
                              @SerializedName(value = "home") var home: HomeModelResponse,
                              @SerializedName(value = "official-artwork") var official_artwork: OfficialAtworkModelResponse
)
