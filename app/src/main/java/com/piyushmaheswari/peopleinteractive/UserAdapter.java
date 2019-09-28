package com.piyushmaheswari.peopleinteractive;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder userViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class UserViewHolder extends RecyclerView.ViewHolder{


        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
