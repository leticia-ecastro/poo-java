//Escreva um programa em Java para gerar uma matriz quadrada T de dimensão N. Imprimir os elementos da 'ampulheta'.

import java.util.Scanner;
import java.util.Random;
 
public class Exercicio20 {
	
	public static void main (String[] args) {
		int n;
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();
        
        do {
            System.out.print("Informe as dimensões da matriz quadrada: ");
            n = entrada.nextInt();
            if (n <= 0) {
                System.out.println("ERRO! Informe apenas valores válidos!");
            }
        } while (n <= 0);
        
        entrada.close();
        int matriz[][] = new int[n][n];
        
        System.out.println();
        
        System.out.println("Gerando a Matriz T:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(50);
                System.out.printf(" %d \t", matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.println();
        
        System.out.println("Imprimindo os elementos da ampulheta:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
				if ((i <= j) && (i + j) <= (n - 1) || (i >= j) && (i + j) >= (n - 1)){ 
					System.out.printf("%d \t", matriz[i][j]);
				} else {
					System.out.printf("\t");}
            }
            System.out.println();
        }
	}
}
