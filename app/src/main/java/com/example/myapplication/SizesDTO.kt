package com.example.myapplication


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class SizesDTO(

	@field:SerializedName("size")
	val size: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null
)