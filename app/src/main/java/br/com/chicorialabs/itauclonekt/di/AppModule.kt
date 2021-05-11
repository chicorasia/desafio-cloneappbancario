package br.com.chicorialabs.itauclonekt.di

import android.content.res.Resources
import br.com.chicorialabs.itauclonekt.viewmodel.ListaServicosViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { (resources: Resources) -> ListaServicosViewModel(resources)  }
}