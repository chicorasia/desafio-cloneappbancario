package br.com.chicorialabs.itauclonekt.viewmodel

import android.view.Menu
import androidx.datastore.core.DataStore
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.chicorialabs.itauclonekt.MenuItemModel
import java.util.prefs.Preferences

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