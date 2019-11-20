package com.example.nlopardoflux.Service;

import com.example.nlopardoflux.Model.UserContainer;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    @GET ("?results=20")
    Call<UserContainer> getUser();

}
