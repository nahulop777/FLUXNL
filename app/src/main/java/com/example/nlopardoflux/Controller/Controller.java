package com.example.nlopardoflux.Controller;

import com.example.nlopardoflux.Dao.Dao;
import com.example.nlopardoflux.Model.UserContainer;
import com.example.nlopardoflux.utils.ResultListener;

public class Controller {

    private Dao dao;

    public Controller(){
        this.dao = new Dao();

    }

    public void getUser (final ResultListener<UserContainer>escuchadorDeLaVista){
        final ResultListener<UserContainer> escuchadorDelControlador = new ResultListener<UserContainer>() {
            @Override
            public void finish(UserContainer user) {
                escuchadorDeLaVista.finish(user);

            }
        };
        dao.getUsers(escuchadorDelControlador);
    }
}
