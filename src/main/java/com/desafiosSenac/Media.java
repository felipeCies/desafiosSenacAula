package com.desafiosSenac;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notaA,notaB,notaC,media;

        System.out.println("Entre com a nota A");
        notaA = scanner.nextDouble();
        System.out.println("Entre com a nota B");
        notaB = scanner.nextDouble();
        System.out.println("Entre com a nota C");
        notaC = scanner.nextDouble();

        notaA = notaA * 0.2;
        notaB = notaB * 0.3;
        notaC = notaC * 0.5;

        media = notaA + notaB + notaC;

        System.out.println("A media final foi de: " +media);

        scanner.close();
    }
}
