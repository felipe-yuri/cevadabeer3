package com.example.cevadabeer.control;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cevadabeer.R;
import com.example.cevadabeer.entities.Cerveja;

import java.util.List;

public class ReceitasAdapter extends RecyclerView.Adapter<ReceitasAdapter.ViewHolderCerveja> {

    private List<Cerveja> dadosCerveja;

    public ReceitasAdapter(List<Cerveja> dadosCerveja) {
        this.dadosCerveja = dadosCerveja;
    }

    @Override
    public ReceitasAdapter.ViewHolderCerveja onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.lista_receita, parent, false);
        ViewHolderCerveja viewHolderCerveja = new ViewHolderCerveja(view);
        return viewHolderCerveja;
    }

    @Override
    public void onBindViewHolder(@NonNull ReceitasAdapter.ViewHolderCerveja holder, int position) {

        if (dadosCerveja != null && dadosCerveja.size() > 0) {

            Cerveja cerveja = dadosCerveja.get(position);
            holder.nomeCerveja.setText(cerveja.getNome());
            holder.estiloCerveja.setText(cerveja.getEstilo());
            holder.complexidadeCerveja.setText(cerveja.getConplexidade());

        }
    }

    @Override
    public int getItemCount() {
        return dadosCerveja.size();
    }

    public class ViewHolderCerveja extends RecyclerView.ViewHolder {

        public TextView nomeCerveja;
        public TextView estiloCerveja;
        public TextView complexidadeCerveja;

        public ViewHolderCerveja(@NonNull View itemView) {
            super(itemView);

            nomeCerveja = (TextView) itemView.findViewById(R.id.tvNomeCervejaReceita);
            estiloCerveja = (TextView) itemView.findViewById(R.id.tvEstiloVar);
            complexidadeCerveja = (TextView) itemView.findViewById(R.id.tvComplexidadeVar);
        }
    }
}
