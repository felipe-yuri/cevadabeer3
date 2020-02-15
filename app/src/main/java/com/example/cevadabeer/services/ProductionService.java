package com.example.cevadabeer.services;

import com.example.cevadabeer.entities.Production;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProductionService {
    @GET("producao")
    Call<Production> buscarProduct();

    @GET("producao/{id}")
    Call<Production> buscarProductId(@Path("id") String id);
}
