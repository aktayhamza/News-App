package com.example.news_app.ui.ui

import androidx.lifecycle.ViewModel
import com.example.news_app.ui.repository.NewsRepository

class NewsViewModel (
    val newsRepository : NewsRepository
) : ViewModel() {
}