package com.newsapiclient.domain.usecase

import com.technobrain.newsapiclient.data.model.APIResponse
import com.technobrain.newsapiclient.data.util.Resource
import com.technobrain.newsapiclient.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(country : String, page : Int): Resource<APIResponse>{
        return newsRepository.getNewsHeadlines(country,page)
    }
}