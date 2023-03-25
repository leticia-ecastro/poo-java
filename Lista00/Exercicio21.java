//Escreva um programa em Java para gerar uma matriz (N x M) e outra (N x P). Gerar uma terceira matriz (N x (M+P)), sendo que para cada linha concatenar suas respectivas colunas e apresentar as três matrizes.

 
public class Exercicio21 {
	
	public static void main (String[] args) {
		int n, m, p, auxiliarColuna;
		n = (int)(Math.random() * 5) + 1;
		m = (int)(Math.random() * 5) + 1;
		p = (int)(Math.random() * 5) + 1;
		auxiliarColuna = 0;
		int[][] matrizA, matrizB, matrizC;
		matrizA = new int[n][m];
		matrizB = new int[n][p];
		matrizC = new int [n][m + p];
        
        System.out.println("Matriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = (int)(Math.random() * 5) + 1;
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println();
        
        System.out.println("Matriz B:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = (int)(Math.random() * 5) + 1;
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println();
        
        //Gerando a matrizC:
        for (int i = 0; i < matrizC.length; i++) {
			auxiliarColuna = 0;
			//Colocando os elementos da matrizA na matrizC:
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizC[i][auxiliarColuna] = matrizA[i][j];
                auxiliarColuna++;
            }
            //Concatenando os elementos da matrizB em C:
            for (int j = 0; j < matrizB[i].length; j++) {
                matrizC[i][auxiliarColuna] = matrizB[i][j];
                auxiliarColuna++;
            }
        }
        
        System.out.println("Matriz C:");
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                System.out.print(matrizC[i][j] + "\t");
            }
            System.out.println();
        }
	}
}
