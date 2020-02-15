package com.example.cevadabeer.activities;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cevadabeer.R;
import com.example.cevadabeer.entities.Cerveja;
import com.example.cevadabeer.services.RetrofitConfig;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ReceitasActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        loadBeerList();
    }

    public void loadBeerList() {

        //Chama o endpoint /cerveja
        Call<List<Cerveja>> call = new RetrofitConfig().getCervejaService().searchBrewery();
        call.enqueue(new Callback<List<Cerveja>>() {

            private List<Cerveja> list;

            @Override
            public void onResponse(Call<List<Cerveja>> call, Response<List<Cerveja>> response) {
                if (!response.isSuccessful()) {
                    Log.e("CervejaService", "Código: " + response.code());
                }
                this.list = response.body();
            }

            @Override
            public void onFailure(Call<List<Cerveja>> call, Throwable t) {
                Log.e("CervejaService   ", "Erro ao buscar ingrediente" + t.getMessage());
            }
        });

    }
}

