package com.rezki.jetpack.navigation

import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val title: String,
    val icon: ImageVector,
    val screen: Screen
)
