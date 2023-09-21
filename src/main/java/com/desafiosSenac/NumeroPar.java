package com.desafiosSenac;

import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Entre com o número");
        numero = scanner.nextInt();

        for (int i =2;  i <= numero;i+=2 ) {
            System.out.println("\n" + i);
        }
    }
}
