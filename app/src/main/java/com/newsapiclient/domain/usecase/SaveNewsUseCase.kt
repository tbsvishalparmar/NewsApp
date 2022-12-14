package com.newsapiclient.domain.usecase

import com.newsapiclient.data.model.Article
import com.newsapiclient.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
  suspend fun execute(article: Article)=newsRepository.saveNews(article)
}