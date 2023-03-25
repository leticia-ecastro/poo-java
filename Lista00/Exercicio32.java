//Escreva um programa em Java para gerar uma matriz (N x M). A matriz deve ser criada com a seguinte dimensão ((N+1) x (M+1)). Para cada linha imprimir a soma na casa final. Repetir o processo para coluna. Na posição ((N+1) x (M+1)), apresentar a soma dos elementos da diagonal principal (linha = coluna).


import java.util.Scanner;

public class Exercicio32 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tamanho, somaLinhas = 0, somaDiagonal = 0;
		
		do {
			System.out.print("Dimensao da Matriz Quadrada: ");
			tamanho = entrada.nextInt();
			
		} while(tamanho < 1);
		
		entrada.close();
		
		int[][] matriz = new int[tamanho + 1][tamanho + 1];
		int[] somaColunas = new int[tamanho];
		
		System.out.println("Matriz:");
		
		for(int i = 0; i < matriz.length; i++) {
			somaLinhas = 0;
			for(int j = 0; j < matriz[i].length; j++) {
				if(j < matriz[i].length - 1  && i < matriz.length -  1) {
					matriz[i][j] = (int)(Math.random() * 10) + 1;
					somaLinhas += matriz[i][j];
				} else {
					matriz[i][j] = somaLinhas;					
				}	
			}
		}
		
		for(int i = 0; i < matriz.length - 1; i++) {		
			for(int j = 0; j < matriz[i].length - 1; j++) {
				if(i == j) {
					somaDiagonal += matriz[i][j];
				}
				somaColunas[j] += matriz[i][j];				
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(i == tamanho && j == tamanho) {
					matriz[i][j] = somaDiagonal;
				}
				if(i == tamanho && j < tamanho) {
					matriz[i][j] = somaColunas[j];
				}
				if(i == tamanho || j == tamanho) {
					System.out.printf("[%d", matriz[i][j]);
					if(matriz[i][j] < 100) {
						System.out.print("]\t");
					} else {
						System.out.print("]\t");
					}
				} else {
					System.out.printf("%d \t", matriz[i][j]);
				}	
			}
			System.out.println("");
		}
	}
}
