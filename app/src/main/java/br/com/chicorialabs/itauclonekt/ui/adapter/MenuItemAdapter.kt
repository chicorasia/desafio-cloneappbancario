package br.com.chicorialabs.itauclonekt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import br.com.chicorialabs.itauclonekt.entidades.MenuItemModel

class MenuItemAdapter : RecyclerView.Adapter<MenuItemViewHolder>() {

    private val list = mutableListOf<MenuItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.menu_item, parent, false)
        return MenuItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuItemViewHolder, position: Int) {
        holder.iniciaVews(list[position])
    }

    override fun getItemCount(): Int = list.size

    fun setItensList(listaRecebida: List<MenuItemModel>){
        list.clear()
        list.addAll(listaRecebida)
        notifyDataSetChanged()
    }

}

class MenuItemViewHolder(val itemView: View) :
    RecyclerView.ViewHolder(itemView) {


        fun iniciaVews(item: MenuItemModel){

            val tvTitle = itemView.findViewById(R.id.card_titulo) as TextView
            tvTitle.text = item.titulo
            val tvIcon = itemView.findViewById(R.id.card_icone) as ImageView
            tvIcon.setImageDrawable(item.icone)
        }

}
