package org.hasancobanoglu.bookapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.hasancobanoglu.bookapp.app.App
import org.hasancobanoglu.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "Book App",
        ) {
            App()
        }
    }
}