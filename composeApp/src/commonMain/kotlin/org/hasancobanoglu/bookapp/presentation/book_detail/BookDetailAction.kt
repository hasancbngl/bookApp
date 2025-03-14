package org.hasancobanoglu.bookapp.presentation.book_detail

import org.hasancobanoglu.bookapp.domain.Book

sealed interface BookDetailAction {
    data object OnBackClick: BookDetailAction
    data object OnFavoriteClick: BookDetailAction
    data class OnSelectedBookChange(val book: Book): BookDetailAction
}