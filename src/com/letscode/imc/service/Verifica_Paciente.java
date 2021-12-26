package com.letscode.imc.service;

import com.letscode.imc.entidades.Paciente;

import java.util.ArrayList;
import java.util.List;

public class Verifica_Paciente {

    public static List<Paciente> pacienteAbaixoPeso = new ArrayList<Paciente>();
    public static List<Paciente> pacienteAcimaPeso = new ArrayList<Paciente>();

    public static void verificarForaPesoIdeal() {

        for (Paciente paciente: Cadastro_Paciente.pacientes) {
            if(paciente.getIMC() < 18.5D) {
                pacienteAbaixoPeso.add(paciente);
            }
            if(paciente.getIMC() > 25.0D) {
                pacienteAcimaPeso.add(paciente);
            }
        }
    }



}
