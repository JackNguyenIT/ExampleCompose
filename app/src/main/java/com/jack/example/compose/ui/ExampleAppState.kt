package com.jack.example.compose.ui

import android.content.Context
import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalContext
import com.jack.example.compose.ui.navigation.AppNavigation
import com.jack.example.compose.ui.navigation.rememberAppNavigation
import kotlinx.coroutines.CoroutineScope

@Composable
fun rememberExampleAppState(
    scaffoldState: ScaffoldState = rememberScaffoldState(),
    appNavigation: AppNavigation = rememberAppNavigation(),
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    appViewModel: ExampleAppStateViewModel,
    context: Context = LocalContext.current
) = ExampleAppState(
    appNavigation = appNavigation,
    scaffoldState = scaffoldState,
    appViewModel = appViewModel,
    coroutineScope = coroutineScope,
    context = context
)

class ExampleAppState(
    val appNavigation: AppNavigation,
    val scaffoldState: ScaffoldState,
    val appViewModel: ExampleAppStateViewModel,
    private val coroutineScope: CoroutineScope,
    private val context: Context,
) {


}