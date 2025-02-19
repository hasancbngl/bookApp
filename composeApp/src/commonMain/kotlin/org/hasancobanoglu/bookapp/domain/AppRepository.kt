package org.hasancobanoglu.bookapp.domain

import org.hasancobanoglu.core.domain.DataError
import org.hasancobanoglu.core.domain.Result

interface AppRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
}