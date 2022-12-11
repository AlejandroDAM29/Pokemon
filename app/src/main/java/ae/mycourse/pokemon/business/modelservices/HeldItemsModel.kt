package ae.mycourse.pokemon.business.modelservices

import com.google.gson.annotations.SerializedName

data class HeldItemsModel(@SerializedName(value = "item") var item: ItemModel,
                          @SerializedName(value = "version_details") var version_details: List<VersionDetailModel>)
