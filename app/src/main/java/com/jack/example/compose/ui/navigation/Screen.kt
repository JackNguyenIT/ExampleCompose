package com.jack.example.compose.ui.navigation

sealed class Screen(val route: String) {

    object Splash : Screen("splash")
    object Main : Screen("main")

}