package com.letscode.imc.entidades;

public class Paciente extends Pessoa {

    public Paciente (String nome, double altura, double peso) {
        super(nome, altura, peso);
    }
    public Paciente () {

    }

    private double calcularIMC() {
        if(peso == 0.0 || altura == 0.0 || nome.isEmpty() || nome == null) {
            return 0.0;
        }
        else {
            return (peso / Math.pow(altura,2));
        }
    }

    public double getIMC() {
        return this.calcularIMC();
    }

    @Override
    public String toString() {
        return  "Paciente " + nome +
                ", de altura " + altura +
                ", com peso " + peso +
                ", possui IMC " + String.format("%.2f", getIMC()) +". ";
    }
}
