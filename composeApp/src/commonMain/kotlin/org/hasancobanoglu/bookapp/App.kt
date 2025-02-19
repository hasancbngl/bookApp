package org.hasancobanoglu.bookapp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import org.hasancobanoglu.bookapp.presentation.book_list.BookListScreenRoot
import org.hasancobanoglu.bookapp.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App() {
    MaterialTheme {
        BookListScreenRoot(
            viewModel = koinViewModel<BookListViewModel>(),
            onBookClick = {

            }
        )
    }
}