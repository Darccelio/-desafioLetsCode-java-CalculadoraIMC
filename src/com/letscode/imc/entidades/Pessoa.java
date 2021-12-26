package com.letscode.imc.entidades;

public class Pessoa {

    protected String nome;
    protected double altura;
    protected double peso;

    public Pessoa() {}

    public Pessoa(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected double getAltura() {
        return altura;
    }
    protected void setAltura(double altura) { this.altura = altura; }

    protected double getPeso() {
        return peso;
    }
    protected void setPeso(double peso) { this.peso = peso; }
}
