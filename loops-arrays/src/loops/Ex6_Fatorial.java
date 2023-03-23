package loops;

import java.util.Scanner;

/*
 * Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex.: 5!=5.4.3.2.1=120
 */

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;
        int multiplicacao = 1;

        System.out.println("Forneça um número inteiro: ");
        fatorial = scan.nextInt();

        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(fatorial + "! = " + multiplicacao);
        
    }
}
