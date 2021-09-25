package com.example.myapplication


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ResponseDTO(

	@field:SerializedName("sizes")
	val sizes: List<SizesDTO?>? = null,

	@field:SerializedName("releaseDate")
	val releaseDate: String? = null,

	@field:SerializedName("year")
	val year: Int? = null,

	@field:SerializedName("styleId")
	val styleId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("media")
	val media: MediaDTO? = null,

	@field:SerializedName("brand")
	val brand: String? = null,

	@field:SerializedName("retailPrice")
	val retailPrice: Int? = null,

	@field:SerializedName("shoe")
	val shoe: String? = null,

	@field:SerializedName("colours")
	val colours: List<ColoursDTO?>? = null
)