//Escreva um programa em Java para gerar uma matriz quadrada S de dimensão N. Imprimir os elementos da 'asa da borboleta'.

import java.util.Scanner;
import java.util.Random;
 
public class Exercicio19 {
	
	public static void main (String[] args) {
		int n;
		Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();
        
        do {
            System.out.print("Informe as dimensões da matriz quadrada: ");
            n = entrada.nextInt();
            if (n <= 0) {
                System.out.println("ERRO! Informe apenas valores válidos!");
            }
        } while (n <= 0);
        
        entrada.close();
        System.out.println();
        
        int matriz[][] = new int[n][n];
        System.out.println("Imprimindo a Matriz N:");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(50);
                System.out.printf("%d \t", matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.println();
        
        System.out.println("Imprimindo as asas da borboleta:");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(i >=  j && (i + j) <= (n - 1) || i <= j && (i + j) >= (n - 1)) {
                    System.out.printf("%d \t", matriz[i][j]);
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}


