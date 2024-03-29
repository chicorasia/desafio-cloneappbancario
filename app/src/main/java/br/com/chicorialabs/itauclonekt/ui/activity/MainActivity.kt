package br.com.chicorialabs.itauclonekt.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.chicorialabs.itauclonekt.databinding.ActivityMainBinding
import br.com.chicorialabs.itauclonekt.ui.adapter.MenuItemAdapter
import br.com.chicorialabs.itauclonekt.viewmodel.ListaServicosViewModel
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity() {

    private val mListaServicosViewModel: ListaServicosViewModel by viewModel {
        parametersOf(resources)
    }

    private lateinit var binding: ActivityMainBinding
    private val rvList: RecyclerView by lazy {
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
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this, 2)
    }


}