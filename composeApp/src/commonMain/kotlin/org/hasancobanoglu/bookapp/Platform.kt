package org.hasancobanoglu.bookapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform