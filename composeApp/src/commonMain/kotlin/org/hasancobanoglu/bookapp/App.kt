package org.hasancobanoglu.bookapp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import bookapp.composeapp.generated.resources.Res
import bookapp.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        var clicked by remember { mutableStateOf(false) }
        var showContent by remember { mutableStateOf(false) }
        Column {
            Text(if (clicked) "clicked" else "not clicked")
            Button(onClick = { clicked = !clicked }) {
                Text("click me ")
            }
        }
    }
}