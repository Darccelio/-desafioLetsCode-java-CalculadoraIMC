package com.letscode.imc.utils;

import com.letscode.imc.entidades.Paciente;
import com.letscode.imc.service.Verifica_Paciente;

public class Impressora {

    private final static String MENSAGEM_PACIENTE_NOME ="Informe o nome do paciente .....: ";
    private final static String MENSAGEM_PACIENTE_PESO = "Qual o peso .....: ";
    private final static String MENSAGEM_PACIENTE_ALTURA = "Qual sua altura .....: ";
    private final static String MENSAGEM_RELACAO_PACIENTES_ACIMA_PESO = "Pacientes acima do peso são .....: ";
    private final static String MENSAGEM_RELACAO_PACIENTES_ABAIXO_PESO = "Pacientes abaixo do peso são .....: ";

    protected static void imprimirMsgNomePaciente() {
        System.out.print(MENSAGEM_PACIENTE_NOME);
    }
    protected static void imprimirMsgPesoPaciente() {
        System.out.print(MENSAGEM_PACIENTE_PESO);
    }
    protected static void imprimirMsgAlturaPaciente() {
        System.out.print(MENSAGEM_PACIENTE_ALTURA);
    }

    public static void imprimirMsgPacientesAbaixoPeso() {
        System.out.println(MENSAGEM_RELACAO_PACIENTES_ABAIXO_PESO);
        for(Paciente paciente : Verifica_Paciente.pacienteAbaixoPeso) {
            System.out.println(paciente.getNome());
        }
        System.out.println();
    }

    public static void imprimirMsgPacientesAcimaPeso() {
        System.out.println(MENSAGEM_RELACAO_PACIENTES_ACIMA_PESO);
        for(Paciente paciente : Verifica_Paciente.pacienteAcimaPeso) {
            System.out.println(paciente.getNome());
        }
        System.out.println();
    }
}
