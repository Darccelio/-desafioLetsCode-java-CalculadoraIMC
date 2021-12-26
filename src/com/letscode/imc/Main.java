package com.letscode.imc;

import com.letscode.imc.entidades.Paciente;
import com.letscode.imc.service.Cadastro_Paciente;
import com.letscode.imc.service.Verifica_Paciente;
import com.letscode.imc.utils.Impressora;


public class Main {
//    Escreva um programa que lê nome, altura e peso de 5 pessoas,
//    calcula o IMC de cada um e ao final informa
//    se alguém está fora do peso ideal (o IMC ideal é entre 18,5 e 25).
    public static void main(String[] args) {

        Cadastro_Paciente.entradaPaciente();
        Verifica_Paciente.verificarForaPesoIdeal();
        Impressora.imprimirMsgPacientesAbaixoPeso();
        Impressora.imprimirMsgPacientesAcimaPeso();

    }
}
