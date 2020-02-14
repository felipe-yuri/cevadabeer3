package com.example.cevadabeer.services;

import com.example.cevadabeer.entities.Brewery;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BeerService {

    @GET("cerveja")
    Call<List<Brewery>> buscarBrewery();

    @GET("cerveja/{id}")
    Call<List<Brewery>> buscarBreweryId(@Path("id") String id);
}
