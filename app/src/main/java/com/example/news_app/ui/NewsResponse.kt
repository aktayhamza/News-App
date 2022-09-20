package com.example.news_app.ui

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)