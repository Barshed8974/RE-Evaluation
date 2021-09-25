package com.example.myapplication

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MediaDTO(

	@field:SerializedName("imageUrl")
	val imageUrl: String? = null
)