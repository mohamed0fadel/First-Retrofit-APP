package com.example.mohamedfadel.tryretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UsersAPI {

    @GET("users")
    Call<List<User>> getUsers();
}
