package org.hasancobanoglu.bookapp.presentation.book_list

import org.hasancobanoglu.bookapp.domain.Book
import org.hasancobanoglu.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "kotlin",
    val searchResults: List<Book> = books,
    val isLoading: Boolean = false,
    val favoriteBooks: List<Book> = emptyList(),
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)

val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://test.com",
        authors = listOf("Philipp Lackner"),
        description = "Description $it",
        languages = emptyList(),
        firstPublishedYear = null,
        averageRating = 4.67854,
        ratingCount = 5,
        numPages = 100,
        numEditions = 3
    )
}