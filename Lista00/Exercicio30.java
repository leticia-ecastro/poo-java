//Escreva um programa em Java para solicitar ao usuário um valor. Este valor lido será a quantidade de elementos de um vetor. Gerar os elementos do vetor. A partir do vetor gerado, criar uma matriz, onde a quantidade de linhas será igual à quantidade de elementos do vetor e as colunas serão os valores dos elementos do vetor mais um. Com a matriz criada, armazenar na primeira coluna de cada linha o respectivo elemento do vetor criado inicialmente e os demais elementos da linha serão formados pela sequencia de Fibonacci. Imprimir a matriz resultante.

 
import java.util.Scanner;

public class Exercicio30 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tamanhoVetor, numero, contador, aleatorio, a, b, c;
		
		do {
            System.out.print("Informe a quantidade de elementos do vetor: ");
            tamanhoVetor = entrada.nextInt();
            if (tamanhoVetor <= 0) {
                System.out.println("ERRO! Informe apenas valores válidos!");
            }
        } while (tamanhoVetor <= 0);
        
        entrada.close();
        
		int[][] matriz = new int[tamanhoVetor][];
		int vetor[] = new int[tamanhoVetor];
		
		for (int i = 0; i < tamanhoVetor; i++) {
			aleatorio = (int)(Math.random() * 10);
			matriz[i] = new int[aleatorio + 1];
			matriz[i][0] = aleatorio;
		}

		for (int i = 0; i < matriz.length; i++) {
			a = 0;
			b = 0;
			c = 1;
			for (int j = 0; j < matriz[i].length; j++) {
				while(j > 0 && matriz[i][j] == 0) {
					matriz[i][j] = b;
					a = b + c;
					b = c;
					c = a;
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Matriz Resultante:");
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(j == 0) {
					System.out.printf("[%d] \t", matriz[i][j]);
				} else {
					System.out.printf("%d \t",matriz[i][j]);
				}
			}
			System.out.println();
		}
	}
}

