package ae.mycourse.pokemon.framework.ui.pokemonlist

import ae.mycourse.pokemon.R
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

class MyRecyclerAdapter(var newList: MutableList<String>?, var imageList: MutableList<String>?) : RecyclerView.Adapter<MyRecyclerAdapter.ViewHolderList>() {

    //RecyclerView Methods
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderList {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.pokemon_item_list, parent, false)
        return ViewHolderList(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderList, position: Int) {
        if (imageList?.get(position) == null){
            holder.pokemonImage.setImageResource(R.drawable.image_not_found)
        }else{
            holder.pokemonImage.picassoConvert(imageList?.get(position))
        }
        holder.pokemonName.text = newList?.get(position)
    }

    override fun getItemCount(): Int {
        if (newList != null) {
            return newList!!.size
        }
        return 0
    }


    @SuppressLint("NotifyDataSetChanged")
    fun filterList(pokemonFilteredNames: MutableList<String>, pokemonFilteredImages: MutableList<String>){
        newList = pokemonFilteredNames
        imageList = pokemonFilteredImages
        notifyDataSetChanged()
    }

    class ViewHolderList(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val pokemonName: TextView = itemView.findViewById(R.id.pokemonListName)
        val pokemonImage: ImageView = itemView.findViewById(R.id.pokemonListImage)
    }
}