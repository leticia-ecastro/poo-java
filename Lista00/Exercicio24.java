//Escreva um programa em Java para solicitar ao usuário dimensões de uma matriz. Preencher a matriz com os elementos da sequencia de Fibonacci e imprimir o resultado.


import java.util.Scanner;

public class Exercicio24 {
	
	public static void main (String[] args) {
		int linhas, colunas, anterior = 0, proximo = 1, fibonacci = 0;
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
        int matrizFibonacci[][] = new int[linhas][colunas];
        
        System.out.println();
        
        System.out.println("Matriz com elementos da sequência de Fibonacci:");
        for (int x = 0; x < matrizFibonacci.length; x++) {
			for (int y = 0; y < matrizFibonacci[x].length; y++) {
				matrizFibonacci[x][y] = anterior;
				System.out.print(matrizFibonacci[x][y] + "\t");
				fibonacci = anterior + proximo;
				anterior = proximo;
				proximo = fibonacci;
			}
			System.out.println();
		}
	}
}

