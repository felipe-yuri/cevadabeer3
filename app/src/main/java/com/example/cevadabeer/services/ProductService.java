package com.example.cevadabeer.services;

import com.example.cevadabeer.entities.Product;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProductService {
    @GET("producao")
    Call<Product> buscarProduct();

    @GET("producao/{id}")
    Call<Product> buscarProductId(@Path("id") String id);
}
