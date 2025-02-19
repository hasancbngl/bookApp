package org.hasancobanoglu.bookapp.data.repository

import org.hasancobanoglu.bookapp.data.mapper.toBook
import org.hasancobanoglu.bookapp.data.network.RemoteBookDataSource
import org.hasancobanoglu.bookapp.domain.AppRepository
import org.hasancobanoglu.bookapp.domain.Book
import org.hasancobanoglu.core.domain.DataError
import org.hasancobanoglu.core.domain.Result
import org.hasancobanoglu.core.domain.map

class BookRepository(
    private val remoteBookDataSource: RemoteBookDataSource,
) : AppRepository {

    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource.searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }

}