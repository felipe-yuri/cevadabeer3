package com.example.cevadabeer.services;

import android.util.Log;
import android.widget.TextView;

import com.example.cevadabeer.entities.Ingrediente;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Services {

    private TextView campo;


    public void loadIngredientService() {
//        campo = (TextView) findById

        Call<List<Ingrediente>> call = new RetrofitConfig().getIngredienteService().buscarIngredient();
        call.enqueue(new Callback<List<Ingrediente>>() {

            @Override
            public void onResponse(Call<List<Ingrediente>> call, Response<List<Ingrediente>> response) {
                if (!response.isSuccessful()) {
                    campo.setText("Código: " + response.code());
                }
                List<Ingrediente> lista = response.body();
                for (Ingrediente ingrediente : lista) {

                    campo.append(
                            "id: " + ingrediente.getId() +
                                    "\nNome: " + ingrediente.getNome() +
                                    "\nQuantidade: " + ingrediente.getQuantidade() + "\n\n"
                    );

                }
            }

            @Override
            public void onFailure(Call<List<Ingrediente>> call, Throwable t) {
                Log.e("IngredienteService   ", "Erro ao buscar ingrediente" + t.getMessage());
            }
        });
    }
}
