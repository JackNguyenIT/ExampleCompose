package com.jack.example.compose.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun ExampleProviders(
    appState: ExampleAppState,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        content = content
    )
}