package br.com.chicorialabs.itauclonekt.entidades

import android.graphics.drawable.Drawable

data class MenuItemModel(
    val titulo: String,
    val icone: Drawable? = null
)