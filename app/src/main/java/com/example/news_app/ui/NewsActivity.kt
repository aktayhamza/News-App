package com.example.news_app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.news_app.databinding.ActivityNewsBinding
import com.example.news_app.ui.db.ArticleDatabase
import com.example.news_app.ui.repository.NewsRepository
import com.example.news_app.ui.ui.NewsViewModel
import com.example.news_app.ui.ui.NewsViewModelProviderFactory
import kotlinx.android.synthetic.main.activity_news.*


class NewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewsBinding
    lateinit var viewModel: NewsViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(newsRepository)
        viewModel = ViewModelProvider(this,viewModelProviderFactory).get(NewsViewModel::class.java)

        //bottom navigation setup
        binding.bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}