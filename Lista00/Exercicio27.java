//Escreva um programa em Java para gerar uma matriz X (N x M). Ordenar as linhas da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.


import java.util.Scanner;
import java.util.Arrays;

public class Exercicio27 {
	
	public static void main (String[] args) {
		int linhas, colunas, auxiliar;
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.print("Informe a quantidade de linhas da matriz: ");
            linhas = entrada.nextInt();
            if (linhas <= 0) {
                System.out.println("ERRO! Informe apenas valores válidos!");
            }
        } while (linhas <= 0);
        
        do {
            System.out.print("Informe a quantidade de colunas da matriz: ");
            colunas = entrada.nextInt();
            if (colunas <= 0) {
                System.out.println("ERRO! Informe apenas valores válidos!");
            }
        } while (colunas <= 0);
        
        entrada.close();
        
        int[][] matriz = new int[linhas][colunas];
        
        System.out.println("\nImprimindo a matriz original:");
        for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 10);
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		for (int i = 0; i < matriz.length; i++) {
			Arrays.parallelSort(matriz[i]);
		}
		
		System.out.println();
		
		System.out.println("Imprimindo a matriz com as linhas ordenadas de forma crescente:");
        for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
