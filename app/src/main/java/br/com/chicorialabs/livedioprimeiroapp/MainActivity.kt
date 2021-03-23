package br.com.chicorialabs.livedioprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.chicorialabs.livedioprimeiroapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val rv_list: RecyclerView by lazy {
        binding.rvList
    }
    private var adapter = MenuItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setItensLista()

        iniciaViews()
    }

    private fun iniciaViews() {
        rv_list.adapter = adapter
        rv_list.layoutManager = GridLayoutManager(this, 2)
    }

    private fun setItensLista() {
        adapter.setItensList(
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