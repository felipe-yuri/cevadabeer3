package com.example.cevadabeer.entities;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Producao {

    private int id;
    private double quantidadeEmLitros;
    private Date dtInicio;
    private Date dtFim;
    private Cerveja cerveja;

    /**
     * No args constructor for use in serialization
     *
     */
    public Producao() {
    }

    /**
     *
     * @param cerveja
     * @param id
     * @param dtInicio
     * @param dtFim
     * @param quantidadeEmLitros
     */
    public Producao(int id, int quantidadeEmLitros, String dtInicio, String dtFim, Cerveja cerveja) throws ParseException {
        super();
        this.id = id;
        this.quantidadeEmLitros = quantidadeEmLitros;

        SimpleDateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        df.setLenient(false);

        this.dtInicio = df.parse(dtInicio);
        this.dtFim = df.parse(dtFim);
        this.cerveja = cerveja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getQuantidadeEmLitros() {
        return quantidadeEmLitros;
    }

    public void setQuantidadeEmLitros(double quantidadeEmLitros) {
        this.quantidadeEmLitros = quantidadeEmLitros;
    }

    public Date getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    public Cerveja getCerveja() {
        return cerveja;
    }

    public void setCerveja(Cerveja cerveja) {
        this.cerveja = cerveja;
    }

}
