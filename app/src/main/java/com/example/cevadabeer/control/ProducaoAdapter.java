package com.example.cevadabeer.control;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cevadabeer.R;
import com.example.cevadabeer.entities.Producao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ProducaoAdapter extends RecyclerView.Adapter<ProducaoAdapter.ViewHolderProducao>{

    private List<Producao> dadosProducao;

    public  ProducaoAdapter(List<Producao> dadosProducao){
        this.dadosProducao = dadosProducao;
    }

    @Override
    public ProducaoAdapter.ViewHolderProducao onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.lista_producao, parent, false);
        ViewHolderProducao viewHolderProducao = new ViewHolderProducao(view);
        return viewHolderProducao;
    }

    @Override
    public void onBindViewHolder(@NonNull ProducaoAdapter.ViewHolderProducao holder, int position) {

        if(dadosProducao != null && dadosProducao.size() > 0){

            Producao producao = dadosProducao.get(position);
            holder.nomeCerveja.setText(producao.getCerveja().getNome());
            holder.quatidadeLitros.setText(Double.toString(producao.getQuantidadeEmLitros()) + " mL");
            holder.diasTermino.setText(Integer.toString(producao.getCerveja().getDiasMaturacao()) + " dias");



            SimpleDateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
            df.setLenient(false);
            Date dataHoje = new Date();
            Date dataFim = (producao.getDtFim());
            Date dataInicio = (producao.getDtInicio());

            long diasConclusao = (dataFim.getTime() - dataHoje.getTime());
            diasConclusao = diasConclusao / 86400000L;

            long tempoMaturacao = (dataFim.getTime() - dataInicio.getTime());
            tempoMaturacao = tempoMaturacao / 86400000L;

            if (diasConclusao < 0){diasConclusao = 0;}
            else{diasConclusao = diasConclusao;}

            double porcentagem = ((diasConclusao + 0.0) * 100.0)/(tempoMaturacao + 0.0);
            porcentagem = porcentagem = 100.0 - porcentagem;


            holder.progresso.setProgress((int)(porcentagem));

        }
    }

    @Override
    public int getItemCount() {
        return dadosProducao.size();
    }

    public class ViewHolderProducao extends RecyclerView.ViewHolder{

        public TextView nomeCerveja;
        public TextView quatidadeLitros;
        public TextView diasTermino;
        public ProgressBar progresso;

        public ViewHolderProducao(@NonNull View itemView) {
            super(itemView);

            nomeCerveja = (TextView) itemView.findViewById(R.id.tvNomeCervejaProducao);
            quatidadeLitros = (TextView) itemView.findViewById(R.id.tvQuantidadeVar);
            diasTermino = (TextView) itemView.findViewById(R.id.tvDiasTerminoVar);
            progresso = (ProgressBar) itemView.findViewById(R.id.barProgressoCerveja);

        }
    }
}
