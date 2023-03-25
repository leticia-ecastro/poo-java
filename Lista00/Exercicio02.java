//Escreva um programa em Java para geral aleatoriamente os elementos (menor que 100) de uma matriz B de 6 linha por 3 colunas, imprimir a matriz gerada e imprimir a matriz em ordem invertida.

public class Exercicio02 {
	
	public static void main (String[] args) {
		int b[][] = new int[6][3];
		
		System.out.println("Matriz B:");
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = (int) (Math.random() * 100);
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\nImprimindo a Matriz B invertida:");
		
		for (int i = b.length - 1; i >= 0; i--) {
			for (int j = b[i].length - 1; j >= 0 ; j--) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}
		
		//b.length - 1 (última posução)
	}
}

