package com.desafiosSenac;

import java.util.Scanner;

public class NotasAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int nota1, nota2, nota3, nota4, nota5, notaTotal;

        System.out.println("Entre com o nome do aluno: ");
        nome = entrada.nextLine();

        System.out.println("Entre com a primeira nota: ");
        nota1 = entrada.nextInt();

        System.out.println("Entre com a segunda nota: ");
        nota2 = entrada.nextInt();

        System.out.println("Entre com a terceira nota: ");
        nota3 = entrada.nextInt();

        System.out.println("Entre com a quarta nota: ");
        nota4 = entrada.nextInt();

        System.out.println("Entre com a quinta nota: ");
        nota5 = entrada.nextInt();

        nota1 = nota1 * 2;
        nota2 = nota2 * 2;
        nota3 = nota3 * 2;
        nota4 = nota4 * 2;
        nota5 = nota5 * 2;
        notaTotal = nota1 + nota2 + nota3 + nota4 + nota5;

        if (notaTotal == 0 ){
            System.out.println("O aluno " + nome + " obteve nota total de :" + notaTotal + " e conceito E, está reprovado" );
        } else if (notaTotal> 0 && notaTotal<= 35 ) {
            System.out.println("O aluno " + nome + " obteve nota total de :" + notaTotal + " e conceito D, está aprovado" );
        } else if (notaTotal >= 36 && notaTotal<= 60  ) {
            System.out.println("O aluno " + nome + " obteve nota total de :" + notaTotal + " e conceito C, está aprovado" );
        } else if (notaTotal >= 61 && notaTotal <= 85) {
            System.out.println("O aluno " + nome + " obteve nota total de :" + notaTotal + " e conceito B, está aprovado" );
        } else if (notaTotal >= 86 && notaTotal <=100) {
            System.out.println("O aluno " + nome + " obteve nota total de :" + notaTotal + " e conceito A, está aprovado" );
        }

            entrada.close();
    }
}
