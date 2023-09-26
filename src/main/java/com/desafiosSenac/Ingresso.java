package com.desafiosSenac;

import java.util.Scanner;

public class Ingresso {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Qual seu nome?");
        nome = scanner.nextLine();

        System.out.println("Qual a sua idade?");
        idade = scanner.nextInt();

        scanner.nextLine();

        if (idade >= 18){
            System.out.println("você estuda python? Responda com s(sim) ou n(não)");
            String estudante;
            estudante = scanner.nextLine();


            System.out.println("Você deseja o ingresso VIP ou Padrão?" + "\n1-Padrão: R$20.000" +"\n2-VIP: R$50.00");
            String ingresso;
            ingresso = scanner.nextLine();

            if (estudante.equalsIgnoreCase("s") && ingresso.equalsIgnoreCase("1")) {

                System.out.println("============================================");
                System.out.println("Comprovante de reserva de ingresso:" +"\n"+ nome +"\n Seu ingresso " +
                        " com desconto por ser estudante de python foi reservado!" + "\n valor do ingresso: " + "R$10.00");

            } else if (estudante.equalsIgnoreCase("s") && ingresso.equalsIgnoreCase("1")){
                System.out.println("============================================");
                System.out.println("Comprovante de reserva de ingresso:" +"\n"+ nome +"\n Seu ingresso foi reservado!"
                        + "\n valor do ingresso: " + "R$20.00");

            } else if (estudante.equalsIgnoreCase("s") && ingresso.equalsIgnoreCase("2")){
                System.out.println("============================================");

                System.out.println("Comprovante de reserva de ingresso:" +"\n"+ nome +"\n Seu ingresso com desconto por ser estudante de python foi reservado!"
                        + "\n valor do ingresso: " + "R$25.00");

            }else if (estudante.equalsIgnoreCase("n") && ingresso.equalsIgnoreCase("2")){
                System.out.println("============================================");
                System.out.println("Comprovante de reserva de ingresso:" +"\n"+ nome +"\n Seu ingresso foi reservado!"
                        + "\n valor do ingresso: " + "R$50.00");
            }
        }
    }
}
