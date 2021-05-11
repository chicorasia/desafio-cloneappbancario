package br.com.chicorialabs.itauclonekt.viewmodel

import android.content.res.Resources
import androidx.core.content.res.ResourcesCompat.getDrawable
import androidx.lifecycle.ViewModel
import br.com.chicorialabs.itauclonekt.R
import br.com.chicorialabs.itauclonekt.entidades.MenuItemModel
import br.com.chicorialabs.itauclonekt.entidades.Servico

class ListaServicosViewModel(val resources: Resources) : ViewModel() {

    private var _listaServicos = arrayListOf<MenuItemModel>()
    val listaServicos: List<MenuItemModel>
        get() = _listaServicos

    init {
        setItensLista()
    }

    private fun setItensLista() {

        Servico.getTodos().forEach {
            _listaServicos.add(
                MenuItemModel(
                    it.nome,
                    getDrawable(resources, it.icone, null)
                )
            )

        }
    }
}