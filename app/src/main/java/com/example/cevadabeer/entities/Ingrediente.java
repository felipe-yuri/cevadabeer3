package com.example.cevadabeer.entities;

public class Ingrediente {

    private int id;
    private String nome;
    private double quantidade;

    /**
     * No args constructor for use in serialization
     *
     */
    public Ingrediente() {
    }

    /**
     *
     * @param nome
     * @param id
     * @param quantidade
     */
    public Ingrediente(int id, String nome, double quantidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

}
