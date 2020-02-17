package com.example.cevadabeer.activities;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cevadabeer.R;
import com.example.cevadabeer.control.ProducaoAdapter;
import com.example.cevadabeer.control.ReceitasAdapter;
import com.example.cevadabeer.entities.Cerveja;
import com.example.cevadabeer.services.RetrofitConfig;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ReceitasActivity extends AppCompatActivity {

    private RecyclerView listaDadosReceitas;
    private ReceitasAdapter receitasAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        listaDadosReceitas = (RecyclerView) findViewById(R.id.rvListaReceitas);
        listaDadosReceitas.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listaDadosReceitas.setLayoutManager(linearLayoutManager);
        carregarListaCerveja();
    }

    public void carregarListaCerveja() {

        //Chama o endpoint /cerveja
        Call<List<Cerveja>> call = new RetrofitConfig().getCervejaService().buscarCerveja();
        call.enqueue(new Callback<List<Cerveja>>() {


            @Override
            public void onResponse(Call<List<Cerveja>> call, Response<List<Cerveja>> response) {
                if (!response.isSuccessful()) {
                    Log.e("CervejaService", "Código: " + response.code());
                }
                List<Cerveja> lista = response.body();
                receitasAdapter = new ReceitasAdapter(lista);
                listaDadosReceitas.setAdapter(receitasAdapter);
            }

            @Override
            public void onFailure(Call<List<Cerveja>> call, Throwable t) {
                Log.e("CervejaService   ", "Erro ao buscar ingrediente" + t.getMessage());
            }
        });

    }
}

