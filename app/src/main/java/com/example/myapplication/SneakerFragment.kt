package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class SneakerFragment : Fragment() {
    private  var reponseList: List<ResponseDTO!>! = listOf<ResponseDTO>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var  view= inflater.inflate(R.layout.fragment_sneaker, container, false)
        callApi()
        return view

    }

    private fun callApi() {
        val apiServices=Network.getRetrofit().create(ApiServices::class.java)
        apiServices.getResponse().enqueue(object : Callback<List<ResponseDTO>>
        {
            override fun onResponse(
                call: Call<List<ResponseDTO>>,
                response: Response<List<ResponseDTO>>
            ) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<List<ResponseDTO>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }

}