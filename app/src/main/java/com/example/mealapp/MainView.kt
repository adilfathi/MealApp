package com.example.mealapp

interface MainView {
    fun showLoading()
    fun onResponse(list: ArrayList<Categories>?)
    fun onError(message: String?)
    fun hideLoading()
}