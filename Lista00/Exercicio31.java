//Escreva um programa em Java para gerar uma matriz (N x M). O usuário deve informar uma faixa de valores inteiros positivos (valor inicial e valor final). O programa deve gerar aleatoriamente os elementos da matriz, respeitando a faixa de valores fornecida pelo usuário. Ao final, imprimir a matriz resultante.


import java.util.Scanner;

public class Exercicio31 {
	
	public static void main (String[] args) {
		int linhas, colunas, valorInicial, valorFinal, auxiliar;
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
        
        System.out.print("\nInforme a faixa de valores para gerar os elementos da matriz:\n");
        
        do {
            System.out.print("Informe o valor inicial: ");
            valorInicial = entrada.nextInt();
            if (linhas <= 0) {
                System.out.println("ERRO! Informe apenas valores válidos!");
            }
        } while (valorInicial <= 0);
        
        do {
            System.out.print("Informe o valor final: ");
            valorFinal = entrada.nextInt();
            if (colunas <= 0) {
                System.out.println("ERRO! Informe apenas valores válidos!");
            }
        } while (valorFinal <= 0);
        
        entrada.close();
        
        if (valorInicial > valorFinal) {
			auxiliar = valorInicial;
			valorInicial = valorFinal;
			valorFinal = auxiliar;
		}
		
		System.out.println();
		
        int[][] matriz = new int[linhas][colunas];
        System.out.println("Matriz gerada:");
        for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int)(Math.random() * (valorFinal - valorInicial) + valorInicial);
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

