package com.example.cevadabeer.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cevadabeer.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void loadStockActivity(View view){
        Intent intent = new Intent(this, EstoqueActivity.class);
        startActivity(intent);
    }

    public void loadProductionActivity(View view){
        Intent intent = new Intent(this, ProducaoActivity.class);
        startActivity(intent);
    }

    public void loadRecipesActivity(View view){
        Intent intent = new Intent(this, ReceitasActivity.class);
        startActivity(intent);
    }
}
