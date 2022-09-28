package com.example.news_app.ui.models

import com.example.news_app.ui.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)