package com.example.news_app.ui.repository

import com.example.news_app.ui.api.RetrofitInstance
import com.example.news_app.ui.db.ArticleDatabase
import com.example.news_app.ui.models.Article

class NewsRepository (
    val db: ArticleDatabase
        ) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)

    suspend fun searchNews(searchQuerry: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuerry, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}