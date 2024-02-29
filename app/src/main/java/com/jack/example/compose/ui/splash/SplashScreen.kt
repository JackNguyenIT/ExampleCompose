package com.jack.example.compose.ui.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun SplashScreen(
    onNavigateToMain: () -> Unit,
    modifier: Modifier = Modifier
) {
    SplashContent(modifier = modifier, onNavigateToMain = {
        onNavigateToMain()
    })

}

@Composable
private fun SplashContent(
    onNavigateToMain: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box {
        Button(onClick = { onNavigateToMain() }, modifier) {
            Text(text = "Simple Button")
        }
    }
}