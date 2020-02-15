package com.example.cevadabeer.entities;

public class Producao {

    private int id;
    private int quantidadeEmLitros;
    private String dtInicio;
    private String dtFim;
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
    public Producao(int id, int quantidadeEmLitros, String dtInicio, String dtFim, Cerveja cerveja) {
        super();
        this.id = id;
        this.quantidadeEmLitros = quantidadeEmLitros;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.cerveja = cerveja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidadeEmLitros() {
        return quantidadeEmLitros;
    }

    public void setQuantidadeEmLitros(int quantidadeEmLitros) {
        this.quantidadeEmLitros = quantidadeEmLitros;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getDtFim() {
        return dtFim;
    }

    public void setDtFim(String dtFim) {
        this.dtFim = dtFim;
    }

    public Cerveja getCerveja() {
        return cerveja;
    }

    public void setCerveja(Cerveja cerveja) {
        this.cerveja = cerveja;
    }

}
