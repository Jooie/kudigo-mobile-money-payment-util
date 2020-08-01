package com.kudigo.mobile_money_util.retrofit

import com.kudigo.mobile_money_util.data.MoMoPaymentInfo
import com.kudigo.mobile_money_util.data.MomoTransactionItem
import retrofit2.Call
import retrofit2.http.*

interface ApiUrls{

    @Headers("Content-Type: application/json")
    @POST("retry_momo_transaction/")
    fun retryPayment(@Body paymentInfo: MoMoPaymentInfo): Call<MoMoPaymentInfo>
    
    @GET("check_momo_status/")
    fun checkPaymentStatus(@Query("transactionId") transactionId:String): Call<MomoTransactionItem>
}