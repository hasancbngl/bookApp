package org.hasancobanoglu.bookapp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import org.hasancobanoglu.bookapp.presentation.book_list.BookListScreenRoot
import org.hasancobanoglu.bookapp.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        BookListScreenRoot(
            viewModel = remember { BookListViewModel() },
            onBookClick = {}
        )
    }
}