package org.hasancobanoglu.bookapp.data.network

import org.hasancobanoglu.bookapp.data.dto.SearchResponseDto
import org.hasancobanoglu.core.domain.DataError
import org.hasancobanoglu.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

}