package com.example.cevadabeer.entities;

import java.util.List;

public class Beer {

    private int id;
    private String cor;
    private double teorAlcoolico;
    private String estilo;
    private String nome;
    private double ibu;
    private int diasMaturacao;
    private String conplexidade;
    private Brewery brewery;
    private List<Recipe> receita = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Beer() {
    }

    /**
     *
     * @param diasMaturacao
     * @param estilo
     * @param receita
     * @param cor
     * @param nome
     * @param conplexidade
     * @param id
     * @param brewery
     * @param ibu
     * @param teorAlcoolico
     */
    public Beer(int id, String cor, double teorAlcoolico, String estilo, String nome, double ibu, int diasMaturacao, String conplexidade, Brewery brewery, List<Recipe> receita) {
        this.id = id;
        this.cor = cor;
        this.teorAlcoolico = teorAlcoolico;
        this.estilo = estilo;
        this.nome = nome;
        this.ibu = ibu;
        this.diasMaturacao = diasMaturacao;
        this.conplexidade = conplexidade;
        this.brewery = brewery;
        this.receita = receita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIbu() {
        return ibu;
    }

    public void setIbu(double ibu) {
        this.ibu = ibu;
    }

    public int getDiasMaturacao() {
        return diasMaturacao;
    }

    public void setDiasMaturacao(int diasMaturacao) {
        this.diasMaturacao = diasMaturacao;
    }

    public String getConplexidade() {
        return conplexidade;
    }

    public void setConplexidade(String conplexidade) {
        this.conplexidade = conplexidade;
    }

    public Brewery getBrewery() {
        return brewery;
    }

    public void setBrewery(Brewery brewery) {
        this.brewery = brewery;
    }

    public List<Recipe> getReceita() {
        return receita;
    }

    public void setReceita(List<Recipe> receita) {
        this.receita = receita;
    }

}

