package com.guilherme.logica;

import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        //listadePalavras();
//        forClassico();
//        forPuro();
        inverteString();
    }

    private static void listadePalavras() {
        ArrayList<String> palavrasList = new ArrayList<>();

        palavrasList.add("Muay Thai");
        palavrasList.add("Games");
        palavrasList.add("GDS");
        palavrasList.add("Guilherme");

        for (String palavra : palavrasList) {
            System.out.println(palavra);
        }
        palavrasList.forEach(palavra -> System.out.println((palavra)));
    }

    private static void forClassico() {
        ArrayList<String> palavraList = new ArrayList<>();

        palavraList.add("Muay Thai");
        palavraList.add("Games");
        palavraList.add("GDS");
        palavraList.add("Guilherme");

//        for (int posicao = 1; posicao < palavraList.size(); posicao++) {
        for (int posicao = 1; posicao < palavraList.size(); posicao = posicao + 2) {
            System.out.println((palavraList.get(posicao)));
        }
    }

    private static void forPuro() {
        for (int posicao = 0; posicao <= 10; posicao ++) {
            System.out.println(posicao);
        }
    }

    private static void inverteString() {
        String invertida = "";
        String normal = "12345";

        for (int posicao = normal.length() - 1; posicao >= 0; posicao = posicao - 1) {
            invertida+= normal.charAt(posicao);
        }
        System.out.println(invertida);
    }
}
