//Escreva um programa em Java para ler uma matriz D de dimensão N x M, onde N e M não poderem ser menores que um. Gerar os elementos aleatoriamente. O usuário deve informar a dimensão (linha e coluna) e um valor máximo para elementos aleatórios. O programa efetuar todas as validações. Lembre-se de aproveitar os recursos da linguagem Java para facilitar as validações.

import java.util.Scanner;
import java.util.Random;

public class Exercicio04 {
	
	public static void main (String[] args) {
		int linhas, colunas, valorMaximo;
		Scanner entrada = new Scanner (System.in);
		
		do {
			System.out.print("Digite a quantidade de linhas da matriz D: ");
			linhas = entrada.nextInt();
			if (linhas < 1) {
				System.out.println("ATENCAO! A matriz deve ter pelo menos uma linha!");
			}
		} while (linhas < 1);
		
		do {
			System.out.print("Digite a quantidade de colunas da matriz D: ");
			colunas = entrada.nextInt();
			if (colunas < 1) {
				System.out.println("ATENCAO! A matriz deve ter pelo menos uma coluna!");
			}
		} while (colunas < 1);
		
		System.out.print("Informe o valor maximo a ser gerado: ");
		valorMaximo = entrada.nextInt();
		
		entrada.close();
		
		int d[][] = new int[linhas][colunas];
		Random gerador = new Random();
		
		System.out.println();
		
		System.out.println("Exibindo a Matriz D de ordem " + linhas + "x" + colunas + ":");
		
		for (int n = 0; n < d.length; n++) {
 			for (int m = 0; m < d[n].length; m++) {
				d[n][m] = gerador.nextInt(valorMaximo);
				System.out.print(d[n][m] + "\t");
			}
			System.out.println();
		}
	}
}

