package org.hasancobanoglu.bookapp

import androidx.compose.ui.window.ComposeUIViewController
import org.hasancobanoglu.bookapp.app.App
import org.hasancobanoglu.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }