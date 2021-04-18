package Adapters

import Model.Monsters
import Services.DataService.monsters
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.mhrrandomizer.R

class MonstersAdapter (val context: Context, val categories: List<Monsters>, val itemClick: (Monsters) -> Unit) : RecyclerView.Adapter<MonstersAdapter.Holder>() {



    inner class Holder(itemView: View, val itemClick: (Monsters) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val monsterImage = itemView.findViewById<ImageView>(R.id.monsterImage)


        fun bindCategory(monsters: Monsters, context: Context){
            val resourceId = context.resources.getIdentifier(monsters.image, "drawable", context.packageName)
            monsterImage?.setImageResource(resourceId)
            itemView.setOnClickListener{ itemClick(monsters)}
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main, parent, false)
        return Holder(view, itemClick)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(monsters[position], context)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }
}