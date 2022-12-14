package com.newsapiclient.domain.usecase

import com.technobrain.newsapiclient.data.model.Article
import com.technobrain.newsapiclient.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)=newsRepository.deleteNews(article)
}