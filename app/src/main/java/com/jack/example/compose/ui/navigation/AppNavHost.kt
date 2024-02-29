package com.jack.example.compose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jack.example.compose.ui.ExampleAppState
import com.jack.example.compose.ui.main.MainScreen
import com.jack.example.compose.ui.splash.SplashScreen

@Composable
fun AppNavHost(
    appNavigation: AppNavigation,
    appState: ExampleAppState,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = appNavigation.navController,
        startDestination = Screen.Splash.route,
        modifier = modifier
    ) {
        composable(Screen.Splash.route) {
            SplashScreen(onNavigateToMain = appNavigation::navigateToMain)
        }
        composable(Screen.Main.route) {
            MainScreen(onNavigateToMain = appNavigation::navigateToMain)
        }
    }
}