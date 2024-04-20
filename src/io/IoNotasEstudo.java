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
    }
}
