package com.example.mvvm2.retrofit;


import com.example.mvvm2.retrofit.user.UsersList;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("/all")
    Call<ArrayList<UsersList>> getUsersList();


}
