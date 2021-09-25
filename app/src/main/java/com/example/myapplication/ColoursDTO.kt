package com.example.myapplication

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ColoursDTO(

	@field:SerializedName("color")
	val color: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)