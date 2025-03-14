package org.hasancobanoglu.bookapp.presentation.book_detail

import org.hasancobanoglu.bookapp.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)
