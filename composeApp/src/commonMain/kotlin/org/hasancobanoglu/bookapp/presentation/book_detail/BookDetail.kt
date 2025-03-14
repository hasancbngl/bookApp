package org.hasancobanoglu.bookapp.presentation.book_detail

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.hasancobanoglu.bookapp.presentation.book_detail.components.BlurredImageBackground
import org.hasancobanoglu.bookapp.presentation.book_list.BookListViewModel

@Composable
fun BookDetailRoot(
    viewModel: BookDetailViewModel,
    onBackClick: () -> Unit,

    ) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    BookDetailScreen(
        state = state,
        onAction = { action ->
            when (action) {
                BookDetailAction.OnBackClick -> onBackClick()
                else -> Unit
            }
            viewModel.onAction(action)
        }
    )
}

@Composable
private fun BookDetailScreen(
    state: BookDetailState,
    onAction: (BookDetailAction) -> Unit
) {

    BlurredImageBackground(
        imageUrl = state.book?.imageUrl,
        isFavorite = state.isFavorite,
        onFavoriteClick = { onAction(BookDetailAction.OnFavoriteClick) },
        onBackClick = { onAction(BookDetailAction.OnBackClick) },
        modifier = Modifier.fillMaxSize()
    ) {

    }
}