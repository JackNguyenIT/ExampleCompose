package com.jack.example.compose.ui.main

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(
    onNavigateToMain: () -> Unit,
    modifier: Modifier = Modifier
) {
    MainContent(modifier = modifier, onNavigateToMain = {
        onNavigateToMain()
    })

}

@Composable
private fun MainContent(
    onNavigateToMain: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box {
        Button(onClick = { onNavigateToMain() }, modifier) {
            Text(text = "Simple Button")
        }
    }
}