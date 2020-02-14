package com.example.cevadabeer.activities;

import android.os.Bundle;

import com.example.cevadabeer.R;
import com.example.cevadabeer.entities.Ingredient;
import com.example.cevadabeer.services.RetrofitConfig;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ScreenActivity extends AppCompatActivity {

    public TextView campo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        loadIngredientService();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void loadIngredientService() {
        campo = findViewById(R.id.tvIngredients);

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
