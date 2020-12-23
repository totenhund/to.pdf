package com.example.topdf

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface DownloadApi {

    @GET("get_pdf")
    fun downloadPdf(): Call<ResponseBody>
}