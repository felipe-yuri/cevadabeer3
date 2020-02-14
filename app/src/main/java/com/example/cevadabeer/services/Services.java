package com.example.cevadabeer.services;

import android.util.Log;
import android.widget.TextView;

import com.example.cevadabeer.entities.Ingredient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Services {

    private TextView campo;


    public void loadIngredientService() {
//        campo = (TextView) findById

        Call<List<Ingredient>> call = new RetrofitConfig().getIngredientService().buscarIngredient();
        call.enqueue(new Callback<List<Ingredient>>() {

            @Override
            public void onResponse(Call<List<Ingredient>> call, Response<List<Ingredient>> response) {
                if (!response.isSuccessful()) {
                    campo.setText("Código: " + response.code());
                }
                List<Ingredient> lista = response.body();
                for (Ingredient ingrediente : lista) {

                    campo.append(
                            "id: " + ingrediente.getId() +
                                    "\nNome: " + ingrediente.getNome() +
                                    "\nQuantidade: " + ingrediente.getQuantidade() + "\n\n"
                    );

                }
            }

            @Override
            public void onFailure(Call<List<Ingredient>> call, Throwable t) {
                Log.e("IngredientService   ", "Erro ao buscar ingrediente" + t.getMessage());
            }
        });
    }
}
