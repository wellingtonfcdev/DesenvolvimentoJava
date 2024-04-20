package io;

import java.util.Scanner;

/*
 * Entrada e Saída (I/O) de dados no Java.
 * 
 * Entrada de dados: Ler dados digitados pelo usuário.
 * Saída de dados: Escrever dados para o usuário.
 */
public class IoNotasEstudo {
    public static void main(String[] args) {
        //Leitura de dados de entrada
        System.out.println("Digite um Número: ");
        Scanner scanner = new Scanner(System.in);
        int valorDitidado = scanner.nextInt();
        System.out.println("Valor digitado: " + valorDitidado);
        scanner.close();

        /*
         * Saída de dados
         * 
         * Tipos de formatação no printf:
         * %c = Caractere simples (char)
         * %s = Cadeia de caracteres (String)
         * %d = Inteiro decimal com sinal (int)
         * %i = Inteiro decimal com sinal (int)
         * %ld = Inteiro decimal longo (long)
         * %f = Real em ponto flutuante (float ou double)
         * %e = Número real em notação científica com o “e” minúsculo (float ou double)
         * %E = Número real em notação científica com o “E” maiúsculo (float ou double)
         * %% = Imprimir o próprio caractere %
         */
        float qualquerNumero = 3.0f;
        System.out.printf("O número digitado foi %f", qualquerNumero);
    }
}
