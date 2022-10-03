package com.example.news_app.ui.repository

import com.example.news_app.ui.api.RetrofitInstance
import com.example.news_app.ui.db.ArticleDatabase

class NewsRepository (
    val db: ArticleDatabase
        ) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)
}