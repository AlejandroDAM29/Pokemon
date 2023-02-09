package ae.mycourse.pokemon.framework.ui.pokemonlist

import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.domain.ListPokemonsModel
import ae.mycourse.pokemon.framework.common.isNull
import ae.mycourse.pokemon.framework.common.picassoConvert
import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MyRecyclerAdapter(var pokemonList: ListPokemonsModel?, var pokemonFavourties: MutableList<String>?) : RecyclerView.Adapter<MyRecyclerAdapter.ViewHolderList>() {

    //RecyclerView Methods
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderList {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.pokemon_item_list, parent, false)
        return ViewHolderList(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderList, position: Int) {
        if (pokemonList?.images?.get(position) == null){
            holder.pokemonImage.setImageResource(R.drawable.image_not_found)
        }else{
            holder.pokemonImage.picassoConvert(pokemonList?.images?.get(position))
        }
        holder.pokemonName.text = pokemonList?.names?.get(position)
        holder.pokemonFavourite.setImageResource(
            isFavourite(pokemonList?.names?.get(position)))
    }

    override fun getItemCount(): Int {
        if (pokemonList?.names != null) {
            return pokemonList!!.names.size
        }
        return 0
    }

    private fun isFavourite(pokemonName: String?): Int{
       var existFavourite = R.drawable.icon_start_no_fav
        if (!pokemonFavourties.isNull()){
            pokemonFavourties?.map { favourite ->
                if (favourite == pokemonName)
                    existFavourite = R.drawable.icon_start_fav
            }
        }
        return existFavourite
    }

    class ViewHolderList(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val pokemonName: TextView = itemView.findViewById(R.id.pokemonListName)
        val pokemonImage: ImageView = itemView.findViewById(R.id.pokemonListImage)
        val pokemonFavourite: ImageView = itemView.findViewById(R.id.imageFavourite)
    }
}