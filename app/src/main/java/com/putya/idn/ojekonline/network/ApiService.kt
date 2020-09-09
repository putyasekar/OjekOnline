package com.putya.idn.ojekonline.network

import com.putya.idn.ojekonline.model.ResultRoute
import io.reactivex.Flowable
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("json")
    fun actionRoute(
        @Query("origin") origin: String,
        @Query("destination") destination: String,
        @Query("key") key: String
    ): Flowable<ResultRoute>

    @Headers(
        "Authorization: key=AAAA-vgud3I:APA91bGZw7m8XP83nlIMjPsVwC44hIDJMFDQWRql0QPTN7FhCHapSjrmFOgKgQs5YPMWxi7htul93QyGcST667dsLi2Tc5jBlaj440n7jYj29npFht2Q-K6oVlZxXrlGF6RG32MA0u_d",
        "Content-Type:application/json"
    )
    @POST("fcm/send")
    fun sendChatNotification(@Body requestNotificaton: RequestNotification): Call<ResponseBody>
}