package com.example.borredapp.data

import com.google.gson.annotations.SerializedName

data class ActivitieResponse(
    val activity: String,
    @SerializedName("accessibility")
    val access:Float = 0.0f,
    val type: String = "",
    @SerializedName("participants")
    val players: Int = 0,
    val price: Float = 0.0f,
    val link: String? = null,
    val key: String? = null
)
