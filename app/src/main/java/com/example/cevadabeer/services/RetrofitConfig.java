package com.example.cevadabeer.services;


import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {
    private Retrofit retrofit;

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://glacial-cliffs-84306.herokuapp.com/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public CervejaService getCervejaService() {
        return this.retrofit.create(CervejaService.class);
    }

    public IngredienteService getIngredienteService() {
        return this.retrofit.create(IngredienteService.class);
    }

    public ProducaoService getProducaoService() {
        return this.retrofit.create(ProducaoService.class);
    }
}
