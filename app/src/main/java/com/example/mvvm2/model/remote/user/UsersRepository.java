package com.example.mvvm2.model.remote.user;

import androidx.lifecycle.MutableLiveData;

import com.example.mvvm2.model.User;
import com.example.mvvm2.model.remote.retrofit.ApiService;
import com.example.mvvm2.model.remote.retrofit.RetrofitClass;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UsersRepository {

    private MutableLiveData<ArrayList<User>> arrayListMutableLiveData = new MutableLiveData<>();
    ArrayList<User> userArrayList = new ArrayList<>();

    public UsersRepository() {
    }

    public void getUsers() {

        ApiService apiService = RetrofitClass.getApiService();
        Call<ArrayList<UsersList>> call = apiService.getUsersList();

        call.enqueue(new Callback<ArrayList<UsersList>>() {
            @Override
            public void onResponse(Call<ArrayList<UsersList>> call, Response<ArrayList<UsersList>> response) {

//                for (int i = 0; i < response.body().size(); i++) {
//                    userArrayList.add(response.body().get(i))
//                }

            }

            @Override
            public void onFailure(Call<ArrayList<UsersList>> call, Throwable t) {

            }
        });

    }

    public MutableLiveData<ArrayList<User>> getArrayListMutableLiveData() {
        return arrayListMutableLiveData;
    }
}
