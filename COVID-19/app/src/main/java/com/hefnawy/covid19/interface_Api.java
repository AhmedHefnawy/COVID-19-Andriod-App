package com.hefnawy.covid19;

import retrofit2.Call;
import retrofit2.http.GET;

public interface interface_Api {

    @GET("summary")
    Call<Covid> getAllData();
}
