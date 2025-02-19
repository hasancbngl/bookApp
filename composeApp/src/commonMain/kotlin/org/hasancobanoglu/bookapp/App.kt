package org.hasancobanoglu.bookapp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import org.hasancobanoglu.bookapp.data.network.KtorRemoteBookDataSource
import org.hasancobanoglu.bookapp.data.network.RemoteBookDataSource
import org.hasancobanoglu.bookapp.data.repository.BookRepository
import org.hasancobanoglu.bookapp.domain.AppRepository
import org.hasancobanoglu.bookapp.presentation.book_list.BookListScreenRoot
import org.hasancobanoglu.bookapp.presentation.book_list.BookListViewModel
import org.hasancobanoglu.core.data.HttpClientFactory
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        BookListScreenRoot(
            viewModel = remember {
                BookListViewModel(
                    repository = BookRepository(
                        remoteBookDataSource = KtorRemoteBookDataSource(
                            HttpClientFactory.create()
                        )
                    )
                )
            },
            onBookClick = {}
        )
    }
}