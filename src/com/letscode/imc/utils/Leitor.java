package com.letscode.imc.utils;

import java.util.Scanner;

public class Leitor {

    private static Scanner sc = new Scanner(System.in);

    public static String receberNomePaciente() {
        Impressora.imprimirMsgNomePaciente();
        return sc.nextLine();
    }

    public static Double receberPesoPaciente() {
        Impressora.imprimirMsgPesoPaciente();
        return Double.parseDouble(sc.nextLine());
    }

    public static Double receberAlturaPaciente() {
        Impressora.imprimirMsgAlturaPaciente();
        return Double.parseDouble(sc.nextLine());
    }
}
