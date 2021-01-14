package com.example.mealapp

import com.google.gson.annotations.SerializedName

data class ApiResponse (
    @SerializedName("categories")
    val categories: ArrayList<Categories>?,

    @SerializedName("meals")
    val meals: ArrayList<Meals>?)