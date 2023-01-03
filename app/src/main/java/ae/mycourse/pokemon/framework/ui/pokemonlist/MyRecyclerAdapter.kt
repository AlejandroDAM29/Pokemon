package ae.mycourse.pokemon.framework.ui.pokemonlist

import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.domain.ListPokemonsModel
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

class MyRecyclerAdapter(var pokemonList: ListPokemonsModel?) : RecyclerView.Adapter<MyRecyclerAdapter.ViewHolderList>() {

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
    }

    override fun getItemCount(): Int {
        if (pokemonList?.names != null) {
            return pokemonList!!.names.size
        }
        return 0
    }

    class ViewHolderList(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val pokemonName: TextView = itemView.findViewById(R.id.pokemonListName)
        val pokemonImage: ImageView = itemView.findViewById(R.id.pokemonListImage)
    }
}