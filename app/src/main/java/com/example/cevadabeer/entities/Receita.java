package com.example.cevadabeer.entities;

import java.util.HashMap;
import java.util.Map;

public class Receita {

    private double quantidade;
    private Ingrediente ingrediente;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Receita() {
    }

    /**
     *
     * @param quantidade
     * @param ingrediente
     */
    public Receita(double quantidade, Ingrediente ingrediente) {
        super();
        this.quantidade = quantidade;
        this.ingrediente = ingrediente;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
