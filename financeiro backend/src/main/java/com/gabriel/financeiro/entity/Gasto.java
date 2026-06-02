package com.gabriel.financeiro.entity;

import jakarta.persistence.*;

@Entity
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private  String titulo;

    private Double valor;

    private String categoria;

    private String data;

    public Gasto(){

    }

    public Gasto(Long id, String titulo, Double valor, String categoria, String data){
        this.id= id;
        this.titulo = titulo;
        this.valor = valor;
        this.categoria= categoria;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
