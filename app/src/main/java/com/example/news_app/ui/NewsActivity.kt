package com.example.news_app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.news_app.databinding.ActivityNewsBinding
import kotlinx.android.synthetic.main.activity_news.*


class NewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //bottom navigation setup
        binding.bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}