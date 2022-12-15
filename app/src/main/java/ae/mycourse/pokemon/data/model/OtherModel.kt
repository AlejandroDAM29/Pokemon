package ae.mycourse.pokemon.data.model

import com.google.gson.annotations.SerializedName

data class OtherModel(@SerializedName(value = "dream_world") var dream_world: DreamWorldModel,
                      @SerializedName(value = "home") var home: HomeModel,
                      @SerializedName(value = "official-artwork") var official_artwork: OfficialAtworkModel
)
