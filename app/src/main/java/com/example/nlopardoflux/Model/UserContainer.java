package com.example.nlopardoflux.Model;

import com.example.nlopardoflux.Model.User;

import java.util.List;

public class UserContainer {

    private List<User> results;

    public UserContainer(){

    }

    public UserContainer (List<User> data){
        this.results =results;

    }

    public List<User> getData() {
        return results;
    }

    public void setData(List<User> data) {
        this.results = data;
    }
}
