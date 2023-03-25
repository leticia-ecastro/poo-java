//Escreva um programa em Java para solicitar ao usuário dimensões de uma matriz. Preencher a matriz com os elementos da sequencia de Primos e imprimir o resultado.


import java.util.Scanner;

public class Exercicio23 {
	
	public static void main (String[] args) {
		int linhas, colunas, numero = 0, contador = 0, autenticador = 0;
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
        int matrizPrimos[][] = new int[linhas][colunas];
        
        System.out.println();
        
        for (int i = 0; i < matrizPrimos.length; i++) {
            for (int j = 0; j < matrizPrimos[i].length; j++) {
				while (autenticador == 0) {
					numero = (int)(Math.random() * 10) + 1;
					for (int x = 1; x <= numero; x++) {
						if (numero % x == 0) {
							contador++;
						}
					}
					if (contador == 2){
						matrizPrimos[i][j] = numero;
						autenticador = numero;
					}
					contador = 0;	
				}
				autenticador = 0;
			}
        }
        
        System.out.println("Matriz de números primos:");
		for(int i = 0; i < matrizPrimos.length; i++) {
			for(int j = 0; j < matrizPrimos[i].length; j++) {	
				System.out.print(matrizPrimos[i][j] + " ");
			}
			System.out.println();
		}
	}
}
