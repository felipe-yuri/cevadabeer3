package com.example.cevadabeer.services;

import com.example.cevadabeer.entities.Ingredient;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IngredientService {
    @GET("ingrediente")
    Call<List<Ingredient>> buscarIngredient();

    @GET("ingrediente/{id}")
    Call<List<Ingredient>> buscarIngredientId(@Path("id") String id);

}
