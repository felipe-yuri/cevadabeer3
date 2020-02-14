package com.example.cevadabeer.entities;

import java.util.HashMap;
import java.util.Map;

public class Recipe {

    private double quantidade;
    private Ingredient ingredient;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Recipe() {
    }

    /**
     *
     * @param quantidade
     * @param ingredient
     */
    public Recipe(double quantidade, Ingredient ingredient) {
        super();
        this.quantidade = quantidade;
        this.ingredient = ingredient;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
