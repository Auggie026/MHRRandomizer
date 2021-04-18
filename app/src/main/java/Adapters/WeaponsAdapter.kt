package Adapters

import Model.Weapons
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.mhrrandomizer.R

class WeaponsAdapter (val context: Context, val weapons: List<Weapons>): RecyclerView.Adapter<WeaponsAdapter.ProductHolder>(){

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val weaponImage = itemView?.findViewById<ImageView>(R.id.weaponImage)

        fun bindProduct(weapons: Weapons, context: Context){
            val resourceId = context.resources.getIdentifier(weapons.image, "drawable", context.packageName)
            weaponImage?.setImageResource(resourceId)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_main, parent, false)
        return ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProduct(weapons[position], context)
    }

    override fun getItemCount(): Int {
        return weapons.count()
    }

}