package org.hasancobanoglu.bookapp.presentation.book_list

import org.hasancobanoglu.bookapp.domain.Book
import org.hasancobanoglu.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResult: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val favoriteBooks: List<Book> = emptyList(),
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)
