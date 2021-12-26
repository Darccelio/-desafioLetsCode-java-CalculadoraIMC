package com.letscode.imc.service;

import com.letscode.imc.entidades.Paciente;
import com.letscode.imc.utils.Leitor;

import java.util.ArrayList;
import java.util.List;

public class Cadastro_Paciente {
    protected static int qtInicialPaciente = 5;

    protected static String nome;
    protected static Double peso;
    protected static Double altura;

    protected static List<Paciente> pacientes = new ArrayList<Paciente>(qtInicialPaciente);

    public static void entradaPaciente() {
        Paciente paciente;
        for (int i = 0; i < qtInicialPaciente; i++) {
            nome = Leitor.receberNomePaciente();
            peso = Leitor.receberPesoPaciente();
            altura = Leitor.receberAlturaPaciente();

            paciente = new Paciente(nome, altura, peso);
            pacientes.add(i, paciente);
        }
    }
}