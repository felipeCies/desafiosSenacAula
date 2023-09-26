package com.desafiosSenac;

import java.util.Scanner;

public class FaixaPedestre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;


        System.out.println("Você é um pedestre ou motorista? Responda de acordo com os números: " +"\n1-Pedestre" +"\n2-Motorista");
        numero = scanner.nextInt();
        scanner.nextLine();

        if (numero == 1){
            System.out.println("Responda as próximas perguntas com S(sim) ou N(não): "
            + "\nVocê está na faixa de pedestres?");
            String resposta1;
            resposta1 = scanner.nextLine();


            System.out.println("\n O sinal está fechado para os carros?");
            String resposta2;
            resposta2 = scanner.nextLine();


            if (resposta1.equalsIgnoreCase("S") && resposta2.equalsIgnoreCase("S")){
                System.out.println("Você pode atravessar a rua com segurança!");
            } else {
                System.out.println("Quer morrer amigo??");
            }
        } else if (numero == 2) {
            System.out.println("Responda as próximas perguntas com S(sim) ou N(não): "
                    + "\nVocê está usando cinto de segurança?");
            String resposta1;
            resposta1 = scanner.nextLine();

            System.out.println("Você ingeriu bebidas alcoólicas antes de dirigir?");
            String resposta2;
            resposta2 = scanner.nextLine();

            System.out.println("O sinal está verde?");
            String resposta3;
            resposta3 = scanner.nextLine();

            if (resposta1.equalsIgnoreCase("S") && resposta2.equalsIgnoreCase("N")
            && resposta3.equalsIgnoreCase("S")){
                System.out.println("Você pode dirigir com segurança.");
            } else {
                System.out.println("Quer morrer amigo??");
            }
        }

                scanner.close();
    }
}
