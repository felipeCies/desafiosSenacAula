package com.desafiosSenac;

import java.util.Scanner;

public class Ingresso {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome, estudante;
        int idade, ingresso;

        System.out.println("Qual seu nome?");
        nome = scanner.nextLine();

        System.out.println("Qual a sua idade?");
        idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("você estuda python? Responda com s(sim) ou n(não)");
            estudante = scanner.nextLine();

            scanner.nextLine();

            System.out.println("Você deseja o ingresso VIP ou Padrão?" + "\n1-Padrão: R$50.000" +"\n2-VIP: R$100.00");
            ingresso = scanner.nextInt();

            if (estudante.equalsIgnoreCase("S")) {
                ingresso = ingresso/2;

                System.out.println("============================================");
                System.out.println("Comprovante de reserva de ingresso:" +"\n"+ nome +"\n Seu ingresso " +
                        " com desconto foi reservado!" + "\n valor do ingresso: " + "R$" +ingresso);
            } else {
                System.out.println("============================================");
                System.out.println("Comprovante de reserva de ingresso:" +"\n"+ nome +"\n Seu ingresso foi reservado!"
                        + "\n valor do ingresso: " + "R$" +ingresso);

            }
        }
    }
}
