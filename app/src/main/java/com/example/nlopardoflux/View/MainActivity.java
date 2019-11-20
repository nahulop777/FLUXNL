package com.example.nlopardoflux.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.nlopardoflux.Controller.Controller;
import com.example.nlopardoflux.Model.User;
import com.example.nlopardoflux.Model.UserContainer;
import com.example.nlopardoflux.R;
import com.example.nlopardoflux.utils.ResultListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterUser.IrAlUsuario {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.recyclerView = findViewById(R.id.Recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        this.recyclerView.setLayoutManager(layoutManager);
        final AdapterUser adapterUser = new AdapterUser(new ArrayList<User>(),this);
        recyclerView.setAdapter(adapterUser);


        Controller controller = new Controller();

        ResultListener<UserContainer> userContainerResultListener = new ResultListener<UserContainer>() {
            public void finish(UserContainer userContainer) {
                List<User> data = userContainer.getData();
                adapterUser.actualizarLista(data);
            }
        };


        controller.getUser(userContainerResultListener);


    }

    @Override
    public void seleccionaronEsteUsuario(User user) {
        Intent intent = new Intent(MainActivity.this,Activity2.class);
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
