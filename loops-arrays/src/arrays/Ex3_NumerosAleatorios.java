package arrays;

import java.util.Random;

// Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor. 
// Ao final, mostre os números e seus sucessores.

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int [] vetor = new int[20];

        for (int i = 0; i < vetor.length; i++) {
            int numero = random.nextInt(100);
            vetor[i] = numero;
        }

        System.out.print("Números aleatórios: ");

        for (int numero : vetor) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos números aleatórios: ");
        
        for (int numero : vetor) {
            System.out.print((numero + 1) + " ");
        }
    }
}
