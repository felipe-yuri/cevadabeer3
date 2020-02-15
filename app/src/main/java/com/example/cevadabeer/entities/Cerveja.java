package com.example.cevadabeer.entities;

import java.util.List;

public class Cerveja {

    private int id;
    private String cor;
    private double teorAlcoolico;
    private String estilo;
    private String nome;
    private double ibu;
    private int diasMaturacao;
    private String conplexidade;
    private Cervejaria cervejaria;
    private List<Receita> receita;

    /**
     * No args constructor for use in serialization
     */
    public Cerveja() {
    }

    /**
     * @param diasMaturacao
     * @param estilo
     * @param receita
     * @param cor
     * @param nome
     * @param conplexidade
     * @param id
     * @param cervejaria
     * @param ibu
     * @param teorAlcoolico
     */
    public Cerveja(int id, String cor, double teorAlcoolico, String estilo, String nome, double ibu, int diasMaturacao, String conplexidade, Cervejaria cervejaria, List<Receita> receita) {
        this.id = id;
        this.cor = cor;
        this.teorAlcoolico = teorAlcoolico;
        this.estilo = estilo;
        this.nome = nome;
        this.ibu = ibu;
        this.diasMaturacao = diasMaturacao;
        this.conplexidade = conplexidade;
        this.cervejaria = cervejaria;
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

    public Cervejaria getCervejaria() {
        return cervejaria;
    }

    public void setCervejaria(Cervejaria cervejaria) {
        this.cervejaria = cervejaria;
    }

    public List<Receita> getReceita() {
        return receita;
    }

    public void setReceita(List<Receita> receita) {
        this.receita = receita;
    }

}

