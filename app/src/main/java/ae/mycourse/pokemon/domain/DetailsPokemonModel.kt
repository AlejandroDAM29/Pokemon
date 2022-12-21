package ae.mycourse.pokemon.domain

import com.google.gson.annotations.SerializedName

data class DetailsPokemonModel(@SerializedName(value = "abilities") var abilities: List<AbilitiesModel>,
                               @SerializedName(value = "base_experience") var base_experience: Int,
                               @SerializedName(value = "forms") var forms: List<FormModel>,
                               @SerializedName(value = "game_indices") var game_indices: List<GameIndexModel>,
                               @SerializedName(value = "height") var height: Int,
                               @SerializedName(value = "held_items") var held_items: List<HeldItemsModel>,
                               @SerializedName(value = "id") var id: Int,
                               @SerializedName(value = "is_default") var is_default: Boolean,
                               @SerializedName(value = "location_area_encounters") var location_area_encounters: String,
                               @SerializedName(value = "moves") var moves: List<MovesModel>,
                               @SerializedName(value = "name") var name: String,
                               @SerializedName(value = "order") var order: Int,
                               @SerializedName(value = "species") var species: SpeciesModel,
                               @SerializedName(value = "sprites") var sprites: SpriteModel,
                               @SerializedName(value = "stats") var stats: List<StatModel>,
                               @SerializedName(value = "types") var types: List<TypeModel>,
                               @SerializedName(value = "weight") var weight: Int)
