package ae.mycourse.pokemon.aplications


import ae.mycourse.pokemon.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MyRecyclerAdapter(private val newList: ArrayList<String>?) : RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder>() {
    //RecyclerView Methods
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.pokemon_item_list, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentTimeItem = newList?.get(position)
        holder.pokemonName.text = currentTimeItem
    }

    override fun getItemCount(): Int {
        if (newList != null) {
            return newList.size
        }
        return 0
    }

    //Internal class to manager RecyclerVIew
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val pokemonName: TextView = itemView.findViewById(R.id.pokemonListName)
    }
}