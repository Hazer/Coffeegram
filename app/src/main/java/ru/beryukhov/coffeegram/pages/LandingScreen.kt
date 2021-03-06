package ru.beryukhov.coffeegram.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedTask
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import kotlinx.coroutines.delay
import ru.beryukhov.coffeegram.R
import ru.beryukhov.coffeegram.app_ui.brown500

private const val SplashWaitTime: Long = 2000


@Composable
fun LandingPage(modifier: Modifier = Modifier, onTimeout: () -> Unit) {
    Box(modifier = modifier.fillMaxSize().background(brown500), alignment = Alignment.Center) {
        LaunchedTask {
            delay(SplashWaitTime)
            onTimeout()
        }
        Image(asset = imageResource(id = R.drawable.logo_splash))
    }
}
