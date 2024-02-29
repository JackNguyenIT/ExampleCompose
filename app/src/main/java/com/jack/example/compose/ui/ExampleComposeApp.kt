package com.jack.example.compose.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import com.jack.example.compose.ui.components.BackgroundWrapper
import com.jack.example.compose.ui.navigation.AppNavHost

@Composable
fun ExampleComposeApp(
    appStateViewModel: ExampleAppStateViewModel = hiltViewModel(),
    appState: ExampleAppState = rememberExampleAppState(appViewModel = appStateViewModel)
) {
    ExampleProviders(appState) {
        BackgroundWrapper {
            Scaffold(
                modifier = Modifier
                    .fillMaxSize(),
                scaffoldState = appState.scaffoldState,
                backgroundColor = Color.Transparent,
            ) { innerPadding ->
                Box(
                    modifier = Modifier
                        .padding(innerPadding)
                ) {
                    AppNavHost(
                        modifier = Modifier
                            .fillMaxSize(),
                        appState = appState,
                        appNavigation = appState.appNavigation,
                    )
                }
            }
        }
    }
}