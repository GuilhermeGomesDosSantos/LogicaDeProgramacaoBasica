package com.guilherme.logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EstruturaDeDecisao {
    public  static void main(String[] args) throws ParseException {
        numeroPar();
        stringIgual();
        stringInicia();
        datas();
    }

    private static void numeroPar() {
        Integer numero = 3;

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

    }
    private static void stringIgual() {
        String frase = "Hoje é segunda feira nove da manhã";

        if (frase.contains("segunda feira")) {

            if (frase.contains("seis da tarde")) {
                System.out.println("Hora da Alegria");

            } else {

                System.out.println("Dia de tristeza");
            }

        } else if (frase.contains("sexta feira") || frase.contains("sabado") || frase.contains("domingo")){
            System.out.println("Dia de Alegria");

        } else {

            System.out.println("Dia normal");
        }
    }

    private static void stringInicia() {
        String palavra = "bobeira";

        if (palavra.startsWith("a")) {
            System.out.println("Palavra iniciada em a");
        } else {
            System.out.println("Palavra iniciada com outra letra");
        }
    }

    private static void datas() throws ParseException {
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse("07/01/2030");

        if (!data.before(new Date())) {
            System.out.println(("Esse dia está por vir"));
        } else {
            System.out.println("Esse dia já passou");
        }
    }
}
