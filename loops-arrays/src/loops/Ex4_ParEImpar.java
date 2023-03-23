package loops;

import java.util.Scanner;

/*
 * Par e Ímpar: Faça um programa que peça N números inteiros. 
 * Calcule e mostre a quantidade de números pares e a quantidade de números impares.
 */

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros = 0;
        int numero = 0;
        int quantNumerosPares = 0;
        int quantNumerosImpares = 0;

        int count = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                quantNumerosPares++;
            } else {
                quantNumerosImpares++;
            }

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade de números pares: " + quantNumerosPares);
        System.out.println("Quantidade de números ímpares: " + quantNumerosImpares);

    }
}
