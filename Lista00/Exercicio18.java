//Escreva um programa em Java para gerar uma matriz quadrada R de dimensão N. Imprimir os elementos da acima da diagonal principal (inclusa) e acima da diagonal secundária (inclusa).
 
import java.util.Scanner;
import java.util.Random;
 
public class Exercicio18 {
	
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
        int matriz[][] = new int[n][n];
        
        System.out.println();
        
        System.out.println("Gerando a Matriz R:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(10);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println();
        
        System.out.print("Diagonal Principal e os elementos acima dela (inclusa): ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i <= j) {
					System.out.print(matriz[i][j] + " ");
				}
            }
        }
        
        System.out.println();
        
        System.out.print("Elementos acima da Diagonal Secundária (inclusa): ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
				if (i + j <= matriz.length - 1) {
					System.out.print(matriz[i][j] + " ");
				}
            }
        }
	}
}