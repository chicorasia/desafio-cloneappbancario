package br.com.chicorialabs.itauclonekt.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.chicorialabs.itauclonekt.databinding.MenuItemBinding
import br.com.chicorialabs.itauclonekt.entidades.MenuItemModel

class MenuItemAdapter : RecyclerView.Adapter<MenuItemViewHolder>() {

    private val list = mutableListOf<MenuItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemViewHolder {
        val binding = MenuItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MenuItemViewHolder(binding = binding)
    }

    override fun onBindViewHolder(holder: MenuItemViewHolder, position: Int) {
        holder.iniciaViews(list[position])
    }

    override fun getItemCount(): Int = list.size

    fun setItensList(listaRecebida: List<MenuItemModel>) {
        list.clear()
        list.addAll(listaRecebida)
        notifyDataSetChanged()
    }

}

class MenuItemViewHolder(private val binding: MenuItemBinding) :
    RecyclerView.ViewHolder(binding.root) {


    fun iniciaViews(item: MenuItemModel) {

        binding.cardTitulo.text = item.titulo
        binding.cardIcone.setImageDrawable(item.icone)
    }

}
