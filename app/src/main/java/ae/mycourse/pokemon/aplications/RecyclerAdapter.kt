package ae.mycourse.pokemon.aplications

import ae.mycourse.pokemon.R
import ae.mycourse.pokemon.business.modelservices.pokemonModel
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val newList : ArrayList<pokemonModel>) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {
    //RecyclerView Methods
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.pokemon_item_list, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentTimeItem = newList[position]
        holder.pokemonName.text = currentTimeItem.namePokemon
    }

    override fun getItemCount(): Int {
        return newList.size
    }

    //Internal class to manager RecyclerVIew
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val pokemonName: TextView = itemView.findViewById(R.id.pokemonListName)
    }
}