/*
 * Escreva um programa em Java para gerar uma matriz F (N x M). 
 * Criar os vetores IMPAR e PAR com a quantidade de elementos (ímpares / pares) da matriz. 
 * Imprimir a matriz e os vetores. 
 * Validar para caso não haja uma das duas possibilidades (sem elementos pares ou ímpares).
 */
 
import java.util.Scanner;
import java.util.Random;

public class Exercicio08 {
	
	public static void main (String[] args) {
		int linhas, colunas, contadorPares = 0, contadorImpares = 0;
		Scanner entrada = new Scanner (System.in);
		Random gerador = new Random();
		
		do {
			System.out.print("Informe a quantidade de linhas da matriz: ");
			linhas = entrada.nextInt();
			System.out.print("Informe a quantidade de colunas da matriz: ");
			colunas = entrada.nextInt();
			if (linhas <= 0 || colunas <= 0) {
				System.out.println("ERRO! Informe valores validos para a quantidade de linhas e colunas!");
			}
		} while (linhas <= 0 || colunas <= 0);
		
		entrada.close();
		
		int matriz[][] = new int[linhas][colunas];
		
		System.out.println();
		
		System.out.println("Matriz F:");
		for (int n = 0; n < matriz.length; n++) {
			for (int m = 0; m < matriz[n].length; m++) {
				matriz[n][m] = gerador.nextInt(10);
				System.out.print(matriz[n][m] + "\t");
				if (matriz[n][m] % 2 == 0) {
					contadorPares++;
				} else {
					contadorImpares++;
				}
			}
			System.out.println();
		}
		
		/*
		 * Matriz F:
		 * 0	3
		 * 4	9
		 * 
		 */
		 
		int pares[] = new int[contadorPares];
		int impares[] = new int[contadorImpares];
		int auxiliarPares = 0, auxiliarImpares = 0;
		
		//Gerando os vetores pares[] e impares[] :
		for (int n = 0; n < matriz.length; n++) {
			for (int m = 0; m < matriz[n].length; m++) {
				if (matriz[n][m] % 2 == 0) {
					pares[auxiliarPares++] = matriz[n][m];
					//pares[0] = matriz[0][0]
					//pares[1] = matriz[1][0]
				} else {
					impares[auxiliarImpares++] = matriz[n][m];
					//impares[0] = matriz[0][1]
					///impares[1] = matriz[1][1]
				}
			}
		}
		
		System.out.println();
		
		auxiliarPares = 0;
		auxiliarImpares = 0;
		
		//Imprimindo o Vetor pares[] :
		System.out.print("Vetor de Pares: ");
		for (int i = 0; i < pares.length; i++) {
			System.out.print(pares[auxiliarPares] + " ");
			auxiliarPares++;
			//pares[0]
			//pares[1]
		}
		
		//Imprimindo o Vetor impares[] :
		System.out.print("\nVetor de Impares: ");
		for (int i = 0; i < impares.length; i++) {
			System.out.print(impares[auxiliarImpares] + " ");
			auxiliarImpares++;
			//impares[0]
			//impares[1]
		}
	}
}
