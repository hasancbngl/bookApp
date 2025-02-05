package org.hasancobanoglu.bookapp

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.hasancobanoglu.bookapp.presentation.book_list.components.BookSearchBar

@Preview(backgroundColor = 0xFFFFFFFF)
@Composable
private fun BookSearchBarPreview() {
    MaterialTheme {
        BookSearchBar(
            "android",
            {},
            {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}