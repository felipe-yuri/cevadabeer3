package com.example.cevadabeer.services;

import com.example.cevadabeer.entities.Cerveja;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CervejaService {

    @GET("cerveja")
    Call<List<Cerveja>> searchBrewery();

    @GET("cerveja/{id}")
    Call<List<Cerveja>> searchBreweryId(@Path("id") String id);
}
