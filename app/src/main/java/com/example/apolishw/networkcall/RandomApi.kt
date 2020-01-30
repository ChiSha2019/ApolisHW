package com.example.apolishw.networkcall

import com.example.apolishw.models.User
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface RandomApi {
    @GET("users/{id}")
    fun getUser( @Path("id") id  :Int) : Observable<User>
}