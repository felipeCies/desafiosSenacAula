package com.desafiosSenac;

import java.util.Scanner;

public class Desafio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, n3, n4, n5;
        int par = 0, impar = 0, negativo = 0, positivo = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Entre com o " + i + "º número:");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            if (numero < 0) {
                negativo++;
            } else {
                positivo++;
            }


    }

        System.out.println("Números pares: " + par);
        System.out.println("Números ímpares: " + impar);
        System.out.println("Números positivos: " + positivo);
        System.out.println("Números negativos: " + negativo);

        scanner.close();
}

}
