package com.example.cevadabeer.entities;


import java.util.HashMap;
import java.util.Map;

public class Cervejaria {

    private int id;
    private String nome;
    private String tipoLogradouro;
    private String nomeRua;
    private String numero;
    private String cidade;
    private String estado;
    private User user;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Cervejaria() {
    }

    /**
     *
     * @param cidade
     * @param estado
     * @param nomeRua
     * @param numero
     * @param nome
     * @param id
     * @param tipoLogradouro
     * @param user
     */
    public Cervejaria(int id, String nome, String tipoLogradouro, String nomeRua, String numero, String cidade, String estado, User user) {
        super();
        this.id = id;
        this.nome = nome;
        this.tipoLogradouro = tipoLogradouro;
        this.nomeRua = nomeRua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.user = user;
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

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
