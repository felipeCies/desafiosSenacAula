package com.desafiosSenac;

import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, n3, n4, n5;
        int par = 0, impar = 0, negativo = 0, positivo = 0;

        System.out.println("Entre com o primeiro número:");
        n1 = scanner.nextInt();
        System.out.println("Entre com o segundo número:");
        n2 = scanner.nextInt();
        System.out.println("Entre com o terceiro número:");
        n3 = scanner.nextInt();
        System.out.println("Entre com o quarto número:");
        n4 = scanner.nextInt();
        System.out.println("Entre com o quinto número:");
        n5 = scanner.nextInt();

        if (n1 % 2 ==0){
            par++;
        } else {
            impar++;
        }
        if (n1 < 0 ){
            negativo ++;
        } else {
            positivo++;
        }
        if (n2 % 2 ==0){
            par++;
        } else {
            impar++;
        }
        if (n2 < 0 ){
            negativo ++;
        } else {
            positivo++;
        }
        if (n3 % 2 ==0){
            par++;
        } else {
            impar++;
        }
        if (n3 < 0 ){
            negativo ++;
        } else {
            positivo++;
        }
        if (n4 % 2 ==0){
            par++;
        } else {
            impar++;
        }
        if (n4 < 0 ){
            negativo ++;
        } else {
            positivo++;
        }
        if (n5 % 2 ==0){
            par++;
        } else {
            impar++;
        }
        if (n5 < 0 ){
            negativo ++;
        } else {
            positivo++;
        }
        System.out.println("Números pares: " +par);
        System.out.println("Números impares: " +impar);
        System.out.println("Números positivos: " +positivo);
        System.out.println("Números negativos: " +negativo);

        scanner.close();


    }
}
