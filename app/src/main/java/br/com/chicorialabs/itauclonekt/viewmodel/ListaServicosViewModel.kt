package br.com.chicorialabs.itauclonekt.viewmodel

import android.content.res.Resources
import androidx.core.content.res.ResourcesCompat.getDrawable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.chicorialabs.itauclonekt.R
import br.com.chicorialabs.itauclonekt.entidades.MenuItemModel
import br.com.chicorialabs.itauclonekt.entidades.Servico
import kotlinx.coroutines.launch

class ListaServicosViewModel(val resources: Resources) : ViewModel() {

    private var _listaServicos = arrayListOf<MenuItemModel>()
    val listaServicos: List<MenuItemModel>
        get() = _listaServicos

    init {
        viewModelScope.launch {
            setItensLista()
        }
    }

    fun setItensLista() {

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