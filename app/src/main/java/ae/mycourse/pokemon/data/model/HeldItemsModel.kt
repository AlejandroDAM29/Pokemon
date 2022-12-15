package ae.mycourse.pokemon.data.model

import com.google.gson.annotations.SerializedName

data class HeldItemsModel(@SerializedName(value = "item") var item: ItemModel,
                          @SerializedName(value = "version_details") var version_details: List<VersionDetailModel>)
