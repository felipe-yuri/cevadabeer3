package com.example.cevadabeer.activities;

import android.os.Bundle;

import com.example.cevadabeer.entities.Ingrediente;
import com.example.cevadabeer.services.RetrofitConfig;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import com.example.cevadabeer.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EstoqueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);
        carregarListaIngredientes();
    }

    public void carregarListaIngredientes() {

        //Chama o endpoint /ingrediente
        Call<List<Ingrediente>> call = new RetrofitConfig().getIngredienteService().buscarIngredient();
        call.enqueue(new Callback<List<Ingrediente>>() {

            private List<Ingrediente> list;

            @Override
            public void onResponse(Call<List<Ingrediente>> call, Response<List<Ingrediente>> response) {
                if (!response.isSuccessful()) {
                    Log.e("IngredienteService", "Código: " + response.code());
                }
                this.list = response.body();
            }

            @Override
            public void onFailure(Call<List<Ingrediente>> call, Throwable t) {
                Log.e("IngredienteService   ", "Erro ao buscar ingrediente" + t.getMessage());
            }
        });

    }
}
