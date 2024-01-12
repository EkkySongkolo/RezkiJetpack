package com.rezki.jetpack.model

data class Animal(
    val id: Int,
    val name: String,
    val type: String,
    val image: Int,
    val description: String,
    val life: String,
    var isFavorite: Boolean = false
)