package com.newsapiclient.domain.usecase

import com.newsapiclient.data.model.APIResponse
import com.newsapiclient.data.util.Resource
import com.newsapiclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
     suspend fun execute(country:String,searchQuery:String,page:Int): Resource<APIResponse>{
         return newsRepository.getSearchedNews(country,searchQuery,page)
     }
}