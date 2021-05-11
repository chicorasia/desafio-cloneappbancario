package br.com.chicorialabs.itauclonekt.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.chicorialabs.itauclonekt.MenuItemAdapter
import br.com.chicorialabs.itauclonekt.databinding.ActivityMainBinding
import br.com.chicorialabs.itauclonekt.viewmodel.ListaServicosViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mListaServicosViewModel: ListaServicosViewModel by viewModel()
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

        iniciaViews()
    }

    private fun iniciaViews() {
        adapter.setItensList(mListaServicosViewModel.listaServicos)
        rv_list.adapter = adapter
        rv_list.layoutManager = GridLayoutManager(this, 2)
    }


}