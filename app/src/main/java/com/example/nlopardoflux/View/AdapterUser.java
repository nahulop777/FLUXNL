package com.example.nlopardoflux.View;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.nlopardoflux.Model.User;
import com.example.nlopardoflux.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterUser extends RecyclerView.Adapter {

    private List<User> userList;
    private IrAlUsuario listener;

    public AdapterUser(List<User> userList, IrAlUsuario listener) {
        this.userList = userList;
        this.listener = listener;
    }

    public AdapterUser() {
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.celda,parent,false);
        UserViewHolder userViewHolder = new UserViewHolder(view);
        return userViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        User unUserDeLaLista = this.userList.get(position);
        UserViewHolder userViewHolder = (UserViewHolder) holder;
        userViewHolder.bindCelda(unUserDeLaLista);
    }

    @Override
    public int getItemCount() {
        return userList.size();
      };



    public class UserViewHolder extends RecyclerView.ViewHolder{


        private ImageView userPic;

        private TextView userName;
        private User user;


        public UserViewHolder(@NonNull View itemView) {
            super(itemView);


            userPic = itemView.findViewById(R.id.fotoUser);

            userName = itemView.findViewById(R.id.nombreUser);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int adapterPosition = getAdapterPosition();
                    User userElegido = userList.get(adapterPosition);
                    listener.seleccionaronEsteUsuario(userElegido);
                }
            });
        }

        public void bindCelda (User user) {

            this.user = user;
            this.userName.setText(this.user.getGender());
            Glide.with(itemView)
                    .load(user.getPicture())
                    .into(userPic);
        }


    }
    public interface IrAlUsuario {
        void seleccionaronEsteUsuario(User user);
    }

    public void actualizarLista(List<User> listaActualizada) {
        this.userList = listaActualizada;
        notifyDataSetChanged();
    }
}
