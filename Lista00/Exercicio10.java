//Escreva um programa em Java para gerar uma matriz quadrada H de dimensão N. Imprimir os elementos da diagonal secundária (linha + coluna = dimensão - 1).

import java.util.Scanner;
import java.util.Random;

public class Exercicio10 {
	
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
        
        System.out.println("Gerando a Matriz H:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        System.out.print("Diagonal Secundária: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == n - 1) {
					System.out.print(matriz[i][j] + " ");
				}
            }
        }
        /*
        * Exemplo: Matriz 3x3
        * 6	1 2		0,0		0,1		0,2
        * 9	9 1		1,0		1,1		1,2
        * 1	2 3		2,0		2,1		2,2
        */
    }
}
