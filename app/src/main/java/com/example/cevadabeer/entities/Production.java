package com.example.cevadabeer.entities;

import java.util.HashMap;
import java.util.Map;

public class Production {

    private int id;
    private int quantidadeEmLitros;
    private String dtInicio;
    private String dtFim;
    private Beer beer;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Production() {
    }

    /**
     *
     * @param beer
     * @param id
     * @param dtInicio
     * @param dtFim
     * @param quantidadeEmLitros
     */
    public Production(int id, int quantidadeEmLitros, String dtInicio, String dtFim, Beer beer) {
        super();
        this.id = id;
        this.quantidadeEmLitros = quantidadeEmLitros;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.beer = beer;
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

    public Beer getBeer() {
        return beer;
    }

    public void setBeer(Beer beer) {
        this.beer = beer;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
