package com.piyushmaheswari.peopleinteractive;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RecyclerInterface {

    String jsonURL="https://randomuser.me/api/?results=10";

    @GET("results")
    Call<String> getUsers();


}
