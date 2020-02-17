package com.example.cevadabeer.control;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cevadabeer.R;
import com.example.cevadabeer.entities.Ingrediente;

import java.util.List;

public class IngredienteAdapter extends RecyclerView.Adapter<IngredienteAdapter.ViewHolderIngrediente> {

    private List<Ingrediente> dadosIngrediente;

    public IngredienteAdapter(List<Ingrediente> dadosIngrediente) {
        this.dadosIngrediente = dadosIngrediente;
    }

    @Override
    public IngredienteAdapter.ViewHolderIngrediente onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.lista_ingrediente, parent, false);
        ViewHolderIngrediente viewHolderIngrediente = new ViewHolderIngrediente(view);
        return viewHolderIngrediente;
    }

    @Override
    public void onBindViewHolder(@NonNull IngredienteAdapter.ViewHolderIngrediente holder, int position) {

        if (dadosIngrediente != null && dadosIngrediente.size() > 0) {

            Ingrediente ingrediente = dadosIngrediente.get(position);
            holder.nomeIngrediente.setText(ingrediente.getNome());
            holder.quantidadeIngrediente.setText(Double.toString(ingrediente.getQuantidade()));
        }
    }

    @Override
    public int getItemCount() {
        return dadosIngrediente.size();
    }

    public class ViewHolderIngrediente extends RecyclerView.ViewHolder {

        public TextView nomeIngrediente;
        public TextView quantidadeIngrediente;

        public ViewHolderIngrediente(@NonNull View itemView) {
            super(itemView);
            nomeIngrediente = (TextView) itemView.findViewById(R.id.tvNomeIngrediente);
            quantidadeIngrediente = (TextView) itemView.findViewById(R.id.tvQuantidadeIngredienteVar);
        }
    }
}
