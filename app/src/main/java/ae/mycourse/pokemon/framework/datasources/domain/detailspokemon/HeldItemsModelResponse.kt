package ae.mycourse.pokemon.framework.datasources.domain.detailspokemon

import com.google.gson.annotations.SerializedName

data class HeldItemsModelResponse(@SerializedName(value = "item") var item: ItemModelResponse,
                                  @SerializedName(value = "version_details") var version_details: List<VersionDetailModelResponse>)
