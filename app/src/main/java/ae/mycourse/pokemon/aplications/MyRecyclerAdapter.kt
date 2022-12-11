package ae.mycourse.pokemon.aplications

import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.interfacesadapter.presenter.pokemonlist.PokemonList
import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import kotlin.coroutines.coroutineContext

class MyRecyclerAdapter(var newList: MutableList<String>?, var imageList: MutableList<String>?) : RecyclerView.Adapter<MyRecyclerAdapter.ViewHolderList>() {

    //RecyclerView Methods
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderList {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.pokemon_item_list, parent, false)
        return ViewHolderList(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderList, position: Int) {
        Log.i("Mensaje2",imageList.toString())
        if (imageList?.get(position) == null){
            holder.pokemonImage.setImageResource(R.drawable.image_not_found)
        }else{
            Picasso.get().load(imageList?.get(position)).into(holder.pokemonImage)
        }
        holder.pokemonName.text = newList?.get(position)

    }

    override fun getItemCount(): Int {
        if (newList != null) {
            //Number of items to return
            /*return newList!!.size*/
            return 150
        }
        return 0

    }

    class ViewHolderList(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val pokemonName: TextView = itemView.findViewById(R.id.pokemonListName)
        val pokemonImage: ImageView = itemView.findViewById(R.id.pokemonListImage)
    }
}