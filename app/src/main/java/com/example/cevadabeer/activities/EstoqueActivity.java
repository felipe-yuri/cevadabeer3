package com.example.cevadabeer.activities;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cevadabeer.R;
import com.example.cevadabeer.control.IngredienteAdapter;
import com.example.cevadabeer.control.ReceitasAdapter;
import com.example.cevadabeer.entities.Ingrediente;
import com.example.cevadabeer.services.RetrofitConfig;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EstoqueActivity extends AppCompatActivity {

    private RecyclerView listaDadosIngredientes;
    private IngredienteAdapter ingredientesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);

        listaDadosIngredientes = (RecyclerView) findViewById(R.id.rvListaIngrediente);
        listaDadosIngredientes.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listaDadosIngredientes.setLayoutManager(linearLayoutManager);
        carregarListaIngredientes();
    }

    public void carregarListaIngredientes() {

        //Chama o endpoint /ingrediente
        Call<List<Ingrediente>> call = new RetrofitConfig().getIngredienteService().buscarIngredient();
        call.enqueue(new Callback<List<Ingrediente>>() {


            @Override
            public void onResponse(Call<List<Ingrediente>> call, Response<List<Ingrediente>> response) {
                if (!response.isSuccessful()) {
                    Log.e("IngredienteService", "Código: " + response.code());
                }
                List<Ingrediente> lista = response.body();
                ingredientesAdapter = new IngredienteAdapter(lista);
                listaDadosIngredientes.setAdapter(ingredientesAdapter);
            }

            @Override
            public void onFailure(Call<List<Ingrediente>> call, Throwable t) {
                Log.e("IngredienteService   ", "Erro ao buscar ingrediente" + t.getMessage());
            }
        });

    }
}
