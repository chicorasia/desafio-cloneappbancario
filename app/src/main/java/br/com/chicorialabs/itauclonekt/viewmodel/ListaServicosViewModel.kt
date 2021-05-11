package br.com.chicorialabs.itauclonekt.viewmodel

import androidx.lifecycle.ViewModel
import br.com.chicorialabs.itauclonekt.entidades.MenuItemModel

class ListaServicosViewModel() : ViewModel() {

    private var _listaServicos = arrayListOf<MenuItemModel>()
    val listaServicos: List<MenuItemModel>
        get() = _listaServicos


    init {
        setItensLista()
    }

    private fun setItensLista() {
        _listaServicos = (
            arrayListOf(
                MenuItemModel("cartões"),
                MenuItemModel("investimentos"),
                MenuItemModel("poupança"),
                MenuItemModel("crédito"),
                MenuItemModel("renegociaçao"),
                MenuItemModel("portabilidade de salário"),
                MenuItemModel("pic"),
                MenuItemModel("pagamentos"),
                MenuItemModel("crédito"),
                MenuItemModel("renegociaçao"),
                MenuItemModel("cartões"),
                MenuItemModel("investimentos"),
                MenuItemModel("poupança"),
                MenuItemModel("crédito"),
                MenuItemModel("renegociaçao"),
            )
        )

    }

}