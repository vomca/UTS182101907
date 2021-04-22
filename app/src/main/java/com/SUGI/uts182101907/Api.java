package com.SUGI.uts182101907;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("/users")
    Call<List<GetData>> GetUserList();
}