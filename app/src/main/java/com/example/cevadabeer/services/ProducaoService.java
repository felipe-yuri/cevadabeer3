package com.example.cevadabeer.services;

import com.example.cevadabeer.entities.Producao;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProducaoService {
    @GET("producao")
    Call<List<Producao>> buscarProducao();

    @GET("producao/{id}")
    Call<List<Producao>> buscarProducaoId(@Path("id") String id);
}
