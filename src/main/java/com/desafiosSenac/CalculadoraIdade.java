package com.desafiosSenac;

import java.util.Scanner;

class CalculadoraIdade {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int idade, idadeDias, idadeMeses;

    System.out.println("Entre com a sua idade: ");
    idade = scanner.nextInt();
    idadeDias = idade * 365;
    idadeMeses = idade * 12;

    System.out.println("Sua idade é: " + "\n" +idade + " anos" + "\n" +idadeDias + " dias"
            + "\n" + idadeMeses + " meses");

        scanner.close();
  }
}
