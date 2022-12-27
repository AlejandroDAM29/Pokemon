package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class DetailsPokemonModelResponse(@SerializedName(value = "abilities") var abilities: List<AbilitiesModelResponse>,
                                       @SerializedName(value = "base_experience") var base_experience: Int,
                                       @SerializedName(value = "forms") var forms: List<FormModelResponse>,
                                       @SerializedName(value = "game_indices") var game_indices: List<GameIndexModelResponse>,
                                       @SerializedName(value = "height") var height: Int,
                                       @SerializedName(value = "held_items") var held_items: List<HeldItemsModelResponse>,
                                       @SerializedName(value = "id") var id: Int,
                                       @SerializedName(value = "is_default") var is_default: Boolean,
                                       @SerializedName(value = "location_area_encounters") var location_area_encounters: String,
                                       @SerializedName(value = "moves") var moves: List<MovesModelResponse>,
                                       @SerializedName(value = "name") var name: String,
                                       @SerializedName(value = "order") var order: Int,
                                       @SerializedName(value = "species") var species: SpeciesModelResponse,
                                       @SerializedName(value = "sprites") var sprites: SpriteModelResponse,
                                       @SerializedName(value = "stats") var stats: List<StatModelResponse>,
                                       @SerializedName(value = "types") var types: List<TypeModelResponse>,
                                       @SerializedName(value = "weight") var weight: Int)
