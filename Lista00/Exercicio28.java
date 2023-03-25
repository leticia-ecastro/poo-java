//Escreva um programa em Java para gerar uma matriz Z (N x M). Ordenar as colunas da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.

 
import java.util.Scanner;

public class Exercicio28 {
	
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

        for (int i = 0; i < colunas; i++) {
			for (int j = 0; j < linhas; j++) {
				for(int k = 0; k < j; k++) {
					if(matriz[k][i] > matriz[j][i]) {
						auxiliar = matriz[k][i];
						matriz[k][i] = matriz[j][i];
						matriz[j][i] = auxiliar;
					}
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Imprimindo a matriz com as colunas ordenadas de forma crescente:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
