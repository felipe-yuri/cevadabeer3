package com.example.cevadabeer.activities;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cevadabeer.R;
import com.example.cevadabeer.control.ProducaoAdapter;
import com.example.cevadabeer.entities.Producao;
import com.example.cevadabeer.services.RetrofitConfig;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProducaoActivity extends AppCompatActivity {


    private RecyclerView listaDadosProducao;
    private ProducaoAdapter producaoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_production);

        listaDadosProducao = (RecyclerView) findViewById(R.id.rvListaProducao);
        listaDadosProducao.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listaDadosProducao.setLayoutManager(linearLayoutManager);

        Call<List<Producao>> call = new RetrofitConfig().getProducaoService().buscarProducao();

        call.enqueue(new Callback<List<Producao>>() {

            @Override
            public void onResponse(Call<List<Producao>> call, Response<List<Producao>> response) {
                if (!response.isSuccessful()) {
                    Log.e("ProducaoService", "Código: " + response.code());
                }
                List<Producao> lista = response.body();
                producaoAdapter = new ProducaoAdapter(lista);

                listaDadosProducao.setAdapter(producaoAdapter);
            }

            @Override
            public void onFailure(Call<List<Producao>> call, Throwable t) {
                Log.e("IngredienteService   ", "Erro ao buscar ingrediente" + t.getMessage());
            }

        });
    }

//    public void carregarListaProducao() {
//
//        //Chama o endpoint /producao
//        Call<List<Producao>> call = new RetrofitConfig().getProducaoService().searchProduct();
//
//        call.enqueue(new Callback<List<Producao>>() {
//            public List<Producao> lista;
//            public ProducaoActivity producaoActivity = new ProducaoActivity();
//
//            @Override
//            public void onResponse(Call<List<Producao>> call, Response<List<Producao>> response) {
//                if (!response.isSuccessful()) {
//                    Log.e("ProducaoService", "Código: " + response.code());
//                }
//                this.lista = response.body();
//                for (Producao producao : lista){
//                    producaoActivity.getListaReg().add(producao);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Producao>> call, Throwable t) {
//                Log.e("IngredienteService   ", "Erro ao buscar ingrediente" + t.getMessage());
//            }
//
//        });
//
//    }


}

