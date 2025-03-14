package org.hasancobanoglu.di

import org.hasancobanoglu.bookapp.data.network.KtorRemoteBookDataSource
import org.hasancobanoglu.bookapp.data.network.RemoteBookDataSource
import org.hasancobanoglu.bookapp.data.repository.BookRepository
import org.hasancobanoglu.bookapp.domain.AppRepository
import org.hasancobanoglu.bookapp.presentation.book_list.BookListViewModel
import org.hasancobanoglu.bookapp.presentation.SharedViewModel
import org.hasancobanoglu.bookapp.presentation.book_detail.BookDetailViewModel
import org.hasancobanoglu.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::BookRepository).bind<AppRepository>()

    viewModelOf(::BookListViewModel)
    viewModelOf(::SharedViewModel)
    viewModelOf(::BookDetailViewModel)
}