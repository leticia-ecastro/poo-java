//Escreva um programa em Java para ler uma matriz C quadrada de dimensão N, onde N é menor ou igual a 20 e imprimir seus elementos. O usuário deve informar o número o tamanho da matriz quadrada (dimensão) e os elementos podem ser gerados aleatoriamente (menor que 100).

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main (String[] args) {
		int tamanho;
		Scanner entrada = new Scanner (System.in);
		
		do {
			System.out.print("Digite o tamanho da matriz quadrada: ");
			tamanho = entrada.nextInt();
			if (tamanho < 1 || tamanho > 20) {
				System.out.println("ATENCAO! O tamanho da matriz deve ser menor que 20!");
			}
		} while (tamanho < 1 || tamanho > 20);
		
		entrada.close();
		
		int c[][] = new int[tamanho][tamanho];
		
		System.out.println("Exibindo a Matriz C de ordem " +tamanho + "x" + tamanho + ":");
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = (int) (Math.random() * (100));
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}

