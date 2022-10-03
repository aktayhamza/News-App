package com.example.news_app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.news_app.R
import com.example.news_app.databinding.ActivityNewsBinding
import com.example.news_app.ui.db.ArticleDatabase
import com.example.news_app.ui.repository.NewsRepository
import com.example.news_app.ui.ui.NewsViewModel
import com.example.news_app.ui.ui.NewsViewModelProviderFactory
import kotlinx.android.synthetic.main.activity_news.*


class NewsActivity : AppCompatActivity() {


    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)


        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(newsRepository)
        viewModel = ViewModelProvider(this,viewModelProviderFactory).get(NewsViewModel::class.java)



        val navHostFragment= supportFragmentManager.findFragmentById(R.id.newsNavHostFragment) as NavHostFragment
        val navController= navHostFragment.navController
        bottomNavigationView.setupWithNavController(navController)
    }
}