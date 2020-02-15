package com.example.cevadabeer.activities;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cevadabeer.R;
import com.example.cevadabeer.entities.Producao;
import com.example.cevadabeer.services.RetrofitConfig;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProducaoActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_production);
        carregarListaProducao();
    }

    public void carregarListaProducao() {

        //Chama o endpoint /producao
        Call<List<Producao>> call = new RetrofitConfig().getProducaoService().searchProduct();
        call.enqueue(new Callback<List<Producao>>() {

            private List<Producao> lista;

            @Override
            public void onResponse(Call<List<Producao>> call, Response<List<Producao>> response) {
                if (!response.isSuccessful()) {
                    Log.e("ProducaoService", "Código: " + response.code());
                }
                this.lista = response.body();
            }

            @Override
            public void onFailure(Call<List<Producao>> call, Throwable t) {
                Log.e("IngredienteService   ", "Erro ao buscar ingrediente" + t.getMessage());
            }
        });

    }
}

