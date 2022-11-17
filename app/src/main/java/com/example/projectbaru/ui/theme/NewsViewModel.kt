package com.example.projectbaru.ui.theme

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.projectbaru.model.Article
import com.example.projectbaru.network.Api
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel(){
    var newsUiState: List<Article> by mutableStateOf(listOf())

    init{
        getTopHeadlines()
    }
    fun getTopHeadlines(){
        viewModelScope.launch{
            val response = Api.newsAPIService.getTopHeadline()
            response.articles.forEach{ article: Article ->
                Log.d("response", article.toString())
            }
            newsUiState = response.articles
        }
    }
}