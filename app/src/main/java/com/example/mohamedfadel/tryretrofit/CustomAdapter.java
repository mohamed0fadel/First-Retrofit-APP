package com.example.mohamedfadel.tryretrofit;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>{

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
        notifyDataSetChanged();
    }

    public CustomAdapter() {
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View rootView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.menu_item,viewGroup, false);
        return new MyViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.name.setText(users.get(i).name);
        myViewHolder.mail.setText(users.get(i).email);
        myViewHolder.phone.setText(users.get(i).phone);
        myViewHolder.web.setText(users.get(i).website);
    }

    @Override
    public int getItemCount() {
        if (users == null)
            return 0;
        return users.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name, phone, mail, web;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.list_txt_name);
            phone = itemView.findViewById(R.id.list_txt_phone);
            mail = itemView.findViewById(R.id.list_txt_mail);
            web = itemView.findViewById(R.id.list_txt_web);
        }
    }
}
