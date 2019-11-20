package com.example.nlopardoflux.Dao;

import com.example.nlopardoflux.Model.User;
import com.example.nlopardoflux.Model.UserContainer;
import com.example.nlopardoflux.Service.Service;
import com.example.nlopardoflux.utils.ResultListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Dao {

    private Retrofit retrofit;
    private String  baseURL;
    private Service service;

    public Dao () {

        baseURL = "https://randomuser.me/api/";
        retrofit = new Retrofit.Builder()
                .baseUrl(baseURL).addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(Service.class);

    }

    public void getUsers (final ResultListener <UserContainer> containerResultListener){
        
        Call<UserContainer> call = service.getUser();
        call.enqueue(new Callback<UserContainer>() {
            @Override
            public void onResponse(Call<UserContainer> call,
                                   Response<UserContainer> response) {
                UserContainer userContainer = response.body();
                containerResultListener.finish(userContainer);

            }


            @Override
            public void onFailure(Call<UserContainer> call, Throwable t) {
                t.printStackTrace();

            }
        });


    }



}


