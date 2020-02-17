package com.example.cevadabeer.services;

import com.example.cevadabeer.entities.Ingrediente;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IngredienteService {
    @GET("ingrediente")
    Call<List<Ingrediente>> buscarIngrediente();

    @GET("ingrediente/{id}")
    Call<List<Ingrediente>> buscarIngredienteId(@Path("id") String id);

}
