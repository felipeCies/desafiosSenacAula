package com.desafiosSenac;

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double htrabalhada, salario, valorH;
        String nome;

        System.out.println("Entre com o nome do funcionario: ");
        nome = scanner.nextLine();

        System.out.println("Entre com as horas trabalhadas (HH/MM): ");
        htrabalhada = scanner.nextDouble();

        valorH = 20.00;
        salario = valorH * htrabalhada;

        System.out.println("O salário do funcionário " +nome+ " será de: " +salario+ " reais.");

    scanner.close();
    }
}
