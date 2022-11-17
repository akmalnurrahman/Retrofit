package com.example.projectbaru

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.projectbaru.ui.theme.NewsApp
import com.example.projectbaru.ui.theme.NewsViewModel


class MainActivity : ComponentActivity() {
    val newsModel = viewModels<NewsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsApp(newsModel.value.newsUiState)
        }
    }
}



