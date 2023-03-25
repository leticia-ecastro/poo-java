//Escreva um programa em Java para gerar uma matriz E de dimensão N x M, determinar e imprimir o maior e o menor elemento deste conjunto, informando a posição dos mesmos.

import java.util.Random;
import java.util.Scanner;

public class Exercicio07 {
	
	public static void main (String[] args) {
		int linhas, colunas, maior = 0, menor = 0;
        Scanner entrada = new Scanner (System.in);

        do {
            System.out.print("Digite a quantidade de linhas da matriz: ");
            linhas = entrada.nextInt();
            System.out.print("Digite a quantidade de colunas da matriz: ");
            colunas = entrada.nextInt();
            if (linhas <= 0 || colunas <= 0) {
                System.out.println("ATENÇAO! Informe valores positivos para a quantidade de linhas e colunas da matriz! ");
            }
        } while (linhas <= 0 || colunas <= 0);

        entrada.close();

        int matriz[][] = new int[linhas][colunas];
        Random gerador = new Random();

        System.out.println();
        System.out.println("Gerando a MAtriz E:");

        for (int n = 0; n < matriz.length; n++) {
            for (int m = 0; m < matriz[n].length; m++) {
                matriz[n][m] = gerador.nextInt(10);
                System.out.print(matriz[n][m] + "\t");
                if (n == 0 && m == 0) {
                    menor = matriz[n][m];
                    maior = matriz[n][m];
                }
                if (matriz[n][m] > maior) {
                maior = matriz[n][m];
                }
                if (matriz[n][m] < menor) {
                menor = matriz[n][m];
                }
            }
            System.out.println();
        }

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {	
                if (matriz[x][y] == maior) {
                System.out.println("Maior = " + maior + "\t Posição: [" + x + ","+ y + "]");
                }
                if (matriz[x][y] == menor) {
                System.out.println("Menor = " + menor + "\t Posição: [" + x + ","+ y + "]");
                }
            }
        }
	}
}
