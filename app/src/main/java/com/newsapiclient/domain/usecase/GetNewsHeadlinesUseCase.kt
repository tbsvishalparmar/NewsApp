package com.newsapiclient.domain.usecase

import com.newsapiclient.data.model.APIResponse
import com.newsapiclient.data.util.Resource
import com.newsapiclient.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(country : String, page : Int): Resource<APIResponse>{
        return newsRepository.getNewsHeadlines(country,page)
    }
}