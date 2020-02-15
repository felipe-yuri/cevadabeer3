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

    public BeerService getBeerService() {
        return this.retrofit.create(BeerService.class);
    }

    public IngredientService getIngredientService() {
        return this.retrofit.create(IngredientService.class);
    }

    public ProductionService getProductService() {
        return this.retrofit.create(ProductionService.class);
    }
}
